package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.ErrorMessageDTO;
import dto.LoginDTO;
import dto.SuccessMessageDTO;
import helper.*;
import models.UsersModel;
import org.mindrot.jbcrypt.BCrypt;
import play.libs.Json;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

public class Users extends Controller {
    @Inject JWTAuthenticator jwtAuthenticator;
    @Inject MailerClient mailerClient;

    public static void adminExistence() {
        int count = UsersModel.find.query().where().eq("user_type","admin").findCount();
        if(count == 0) {
            UsersModel user = new UsersModel("Administrator","admin@yopmail.com","0780000001","admin");
            user.setPassword(BCrypt.hashpw("12345", BCrypt.gensalt(12)));
            user.save();
        }
    }
    public Result save(Http.Request request) {
        try {
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            if(!body.has("password")) body.put("password",12345);
            String formValidation = validateSignup(body);
            if(!formValidation.equals("valid"))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, formValidation)));

            if (isUserexist(body.get("phone").asText())) {
                return forbidden(Json.toJson(new ErrorMessageDTO(Constants.ERROR_DUPLICATE_VALUE, Constants.ERROR_EXISTS_MESSAGE)));
            }
            long verificationCodeExp = DateUtil.getVerificationCodeExpirationTime();
            System.out.println(verificationCodeExp);
            Date d = new Date();
            d.setTime(verificationCodeExp*1000);

            String verificationCode = HelperUtil.generateRandomString(6);
            body.put("status", "active");
            UsersModel user = Json.fromJson(body, UsersModel.class);
            user.setVerified(true);
            user.setResetVerificationCode(verificationCode);
            user.setResetVerificationCodeExpiration(verificationCodeExp);
            user.setPassword(BCrypt.hashpw(body.get("password").asText(), BCrypt.gensalt(12)));
            user.save();
//            new MailerService(mailerClient).sendEmail(user.getEmail(),"Account verification",MailBody.verificationCode(verificationCode,DateUtil.dateToString(d)),"","");

        } catch (
                Exception ex) {
            System.out.println(ex.toString());
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.USER_SAVED, Constants.USER_SAVED_MESSAGE)));
    }

    public Result findById(Http.Request request, String id) {
        UsersModel userInfo = UsersModel.find.byId(Long.valueOf(id));
        if (userInfo == null)
            return ok(Json.toJson(new ErrorMessageDTO("not exist", Constants.USER_NOTEXIST_MESSAGE)));
        return ok(Json.toJson(userInfo));
    }
//    @Security.Authenticated(JWTAuthenticator.class)
    public Result find(Http.Request request) {
//        if(!jwtAuthenticator.parseData(request,"user_type").equals("admin")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
        List<UsersModel> users = UsersModel.find.query().where().eq("is_deleted", false).findList();
        return ok(Json.toJson(users));
    }

//    @Security.Authenticated(JWTAuthenticator.class)
    public Result findByType(Http.Request request) {
//        if(!jwtAuthenticator.parseData(request,"user_type").equals("admin")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
        String userType = request.queryString("user_type").get();
        List<UsersModel> users = UsersModel.find.query().where().eq("user_type", userType).eq("is_deleted", false).findList();
        return ok(Json.toJson(users));
    }

    public Result login(Http.Request request) {
        adminExistence();
        long expireTime = System.currentTimeMillis() * 1000 * 1800;
        JsonNode body = request.body().asJson();

        if (!Validator.email(body.get("email").asText().trim()))
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.INVALID_EMAIL)));
        if (!Validator.password(body.get("password").asText()))
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_WEAK_PASSWORD)));
        UsersModel userInfo = UsersModel.find.query().where().eq("email", body.get("email").textValue()).eq("is_deleted", false).findOne();
        if (userInfo != null) {
            Long userId = Long.valueOf(String.valueOf(userInfo.getId()));
            System.out.println(userInfo.getPassword());
            System.out.println(BCrypt.checkpw(body.get("password").asText(), userInfo.getPassword()));
            if (BCrypt.checkpw(body.get("password").asText(), userInfo.getPassword())) {//generate token
                if (userInfo.getStatus().equals("active")) {
                    userInfo.setLastLogin(DateUtil.currentTime());
                    userInfo.update();

                    return ok(Json.toJson(new LoginDTO(JwtToken.generateToken(String.valueOf(userInfo.getId()), userInfo.getEmail(), userInfo.getPhone(), userInfo.getUserType()), userInfo)));
                } else if (userInfo.getStatus().equals("verify_account")) {
                    return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_ACCOUNT_LOCKED, Constants.ERROR_ACCOUNT_VERIFY)));
                } else if (userInfo.getStatus().equals("locked"))
                    return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_ACCOUNT_LOCKED, Constants.ERROR_ACCOUNT_LOCKED_MESSAGE)));
                else
                    return unauthorized(Json.toJson(new ErrorMessageDTO(Constants.ERROR_LOGIN, Constants.ERROR_LOGIN_MESSAGE)));
            } else {
                return unauthorized(Json.toJson(new ErrorMessageDTO(Constants.ERROR_LOGIN, Constants.ERROR_LOGIN_MESSAGE)));
            }
        } else {
            return unauthorized(Json.toJson(new ErrorMessageDTO(Constants.ERROR_LOGIN, Constants.ERROR_LOGIN_MESSAGE)));
        }
    }

//    @Security.Authenticated(JWTAuthenticator.class)
    public Result update(Http.Request request, String id) {
        ObjectNode body = (ObjectNode) request.body().asJson();
        try {
            UsersModel userInfo = UsersModel.find.byId(Long.valueOf(id));
            if (userInfo == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));

            String formValidation = validateUpdate(body);
            if(!formValidation.equals("valid"))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, formValidation)));
            System.out.println(userInfo.getName());
            userInfo.setName(body.get("name").asText());
            userInfo.setPhone(body.get("phone").asText());
            userInfo.setEmail(body.get("email").asText());
            userInfo.setUserType(body.get("user_type").asText());
            userInfo.update();
        } catch (Exception ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.USER_UPDATED_MESSAGE)));
    }

    public Result verifyAccount(Http.Request request, String id) {
        JsonNode body = request.body().asJson();
        String verificationCode = body.get("code").asText();
        UsersModel userInfo = UsersModel.find.byId(Long.valueOf(id));
        try {
            if (userInfo == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
            if(userInfo.getResetVerificationCodeExpiration()<DateUtil.currentTime())
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.VERIFICATION_CODE_EXPIRED)));
            if(!userInfo.getResetVerificationCode().equals(verificationCode))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.VERIFICATION_CODE_NOTMATCH)));

            userInfo.setVerified(true);
            userInfo.update();
        } catch (NullPointerException ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
        }

        return ok(Json.toJson(new LoginDTO(JwtToken.generateToken(String.valueOf(userInfo.getId()), userInfo.getEmail(), userInfo.getPhone(), userInfo.getUserType()), userInfo)));
    }

    @Security.Authenticated(JWTAuthenticator.class)
    public Result updatePassword(Http.Request request,int id) {
        JsonNode body = request.body().asJson();
        try {
            UsersModel userInfo = UsersModel.find.query().where().eq("email",body.get("email").asText()).findOne();
                       if(userInfo==null) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
            if (!BCrypt.checkpw(body.get("currentPassword").asText(), userInfo.getPassword()))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.INVALID_CURRENT_PASSWORD)));
            if (BCrypt.checkpw(body.get("newPassword").asText(), userInfo.getPassword()))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_PASSWORD_NOTALLOWED)));

            userInfo.setPassword(BCrypt.hashpw(body.get("currentPassword").asText(), BCrypt.gensalt(12)));
            userInfo.setUpdatedAt(DateUtil.currentTime());
            userInfo.update();
        } catch (NullPointerException ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.PASSWORD_UPDATED, Constants.PASSWORD_UPDATED_MESSAGE)));
    }
    public Result forgotPassword(Http.Request request) {
        JsonNode body = request.body().asJson();
        try {
            UsersModel userInfo = UsersModel.find.query().where().eq("email",body.get("email").asText()).findOne();
            if(userInfo==null) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
           //generate reset code,send via email
            String code = HelperUtil.generateRandomNumber(6);
            long codeExpiration = DateUtil.getVerificationCodeExpirationTime();
            Date dateCodeExpiration = new Date();
            dateCodeExpiration.setTime(codeExpiration*1000);
            userInfo.setResetVerificationCode(code);
            userInfo.setResetVerificationCodeExpiration(codeExpiration);
            userInfo.update();
            //send sms notification
            new MailerService(mailerClient).sendEmail(userInfo.getEmail(),"Reset password account verification",MailBody.verificationCode(code,DateUtil.dateToString(dateCodeExpiration)),"","");

        } catch (NullPointerException ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.CHECK_VERIFICATION_CODE_MESSAGE)));
    }
    public Result verifyResetCode(Http.Request request) {
        JsonNode body = request.body().asJson();
        try {
            System.out.println(body.get("code").asText());
            UsersModel userInfo = UsersModel.find.query().where().eq("email",body.get("email").asText()).eq("reset_verification_code",body.get("code").asText()).gt("reset_verification_code_expiration",DateUtil.currentTime()).findOne();
            if(userInfo==null) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_VERIFICATION_CODE_FAILED)));
        } catch (NullPointerException ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.SUCCESS)));
    }
    public Result resetPassword(Http.Request request) {
        JsonNode body = request.body().asJson();
        try {
            UsersModel userInfo = UsersModel.find.query().where().eq("email",body.get("email").asText()).eq("reset_verification_code",body.get("code").asText()).gt("reset_verification_code_expiration",DateUtil.currentTime()).findOne();
            if(userInfo==null) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_VERIFICATION_CODE_FAILED)));

            if (!Validator.password(body.get("password").asText()))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_WEAK_PASSWORD)));

            userInfo.setPassword(BCrypt.hashpw(body.get("password").asText(), BCrypt.gensalt(12)));
            userInfo.setUpdatedAt(DateUtil.currentTime());
            userInfo.setResetVerificationCode("");
            userInfo.setResetVerificationCodeExpiration(0);
            userInfo.update();
        } catch (NullPointerException ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.PASSWORD_UPDATED, Constants.PASSWORD_UPDATED_MESSAGE)));
    }

    public boolean isUserexist(String phone) {
        int usersFound = UsersModel.find.query().where().or().eq("phone", phone).endOr().findCount();
        return usersFound > 0;
    }

    @Security.Authenticated(JWTAuthenticator.class)
    public Result delete(Http.Request request, String id) {
        try {
            JsonNode body = request.body().asJson();
            UsersModel usersModel = UsersModel.find.byId(Long.valueOf(id));
            if (usersModel == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
//            if (!jwtAuthenticator.parseData(request,"user_type").equals("admin"))
//                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_ACCESS_DENIED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            usersModel.setDeleted(true);
            usersModel.setDeletedAt(DateUtil.currentTime());
            usersModel.update();
        } catch (
                Exception ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.USER_DELETED_MESSAGE)));
    }

    public Result lock(Http.Request request, String id) {
        try {
            JsonNode body = request.body().asJson();
            UsersModel usersModel = UsersModel.find.byId(Long.valueOf(id));
            if (usersModel == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            if (!usersModel.getUserType().equals("admin"))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_ACCESS_DENIED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            usersModel.setStatus("locked");
            usersModel.update();
        } catch (
                Exception ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.USER_DELETED_MESSAGE)));
    }

    public Result unlock(Http.Request request, String id) {
        try {
            JsonNode body = request.body().asJson();
            UsersModel usersModel = UsersModel.find.byId(Long.valueOf(id));
            if (usersModel == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            if (!usersModel.getUserType().equals("admin"))
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_ACCESS_DENIED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            usersModel.setStatus("active");
            usersModel.update();
        } catch (
                Exception ex) {
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.USER_DELETED_MESSAGE)));
    }

    public Result sendEmail() {
        new MailerService(mailerClient).sendEmail("Roger <mnzroger@gmail.com>","Account verification",MailBody.verificationCode("34676","2024-03-17 14:10 GMT+2"),"","");
        return ok();
    }
    public Result sendSms(){
        return SmsUtils.sendSms();
    }
    public String validateSignup(ObjectNode data){
        String name = data.get("name").asText(),
                phone = data.get("phone").asText(),
                password = data.get("password").asText();
        if(name.trim().isEmpty()) return "Name should not be empty";
//        if(email.trim().isEmpty()) return "Email should not be empty";
//        if(!Validator.email(email)) return "Invalid email address";
        if(!Validator.phoneNumber(phone)) return "Invalid phone number";
//        if(!Validator.password(password)) return "Password must be 6 or more characters including lowercase,uppercase,numbers and special characters";
        return "valid";
    }
    public String validateUpdate(ObjectNode data){
        String name = data.get("name").asText(),
                email = data.get("email").asText(),
                phone = data.get("phone").asText();
        if(name.trim().isEmpty()) return "Name should not be empty";
        if(email.trim().isEmpty()) return "Email should not be empty";
        if(!Validator.email(email)) return "Invalid email address";
        if(!Validator.phoneNumber(phone)) return "Invalid phone number";
        return "valid";
    }
    public String validateLogin(ObjectNode data){
        String email = data.get("email").asText(),
                password = data.get("password").asText();
        if(email.trim().isEmpty()) return "Email should not be empty";
        if(!Validator.email(email)) return "Invalid email address";
        if(!Validator.password(password)) return "Password must be 6 or more characters including number and special characters";
        return "valid";
    }
}
