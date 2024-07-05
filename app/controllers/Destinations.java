package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.ErrorMessageDTO;
import dto.SuccessMessageDTO;
import helper.Constants;
import helper.DateUtil;
import helper.JWTAuthenticator;
import models.DestinationModel;
import models.StationModel;
import models.UsersModel;
import play.api.mvc.Request;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.List;

public class Destinations extends Controller {
    @Inject
    JWTAuthenticator jwtAuthenticator;

    public Result save(Http.Request request) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            UsersModel company = UsersModel.find.query().where().eq("id", userId).eq("is_deleted",false).findOne();
            if (company == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            int destinationExist = DestinationModel.find.query().where().eq("departure",body.get("departure").asText()).eq("arrival",body.get("arrival").asText()).eq("company_id",userId).findCount();
            if (destinationExist>0)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_DESTINATION_ALREADY_EXIST)));
            DestinationModel destination = new DestinationModel(body.get("departure").asText(),body.get("arrival").asText(),body.get("price").asInt());
            destination.setCompany(company);
            destination.save();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.DESTINATION_SAVED_MESSAGE)));
    }
    public Result findById(Http.Request request, String id) {
        DestinationModel destination = DestinationModel.find.byId(Long.valueOf(id));
        if (destination == null)
            return ok(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_DESTINATION_NOTEXIST)));
        return ok(Json.toJson(destination));
    }
//        @Security.Authenticated
    public Result find(Http.Request request) {
//        if(!jwtAuthenticator.parseData(request,"user_type").equals("admin")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
        List<DestinationModel> destinations = DestinationModel.find.query().where().eq("is_deleted", false).findList();
        return ok(Json.toJson(destinations));
    }
    public Result update(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            UsersModel company = UsersModel.find.query().where().eq("id", userId).eq("is_deleted",false).findOne();
            if (company == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            DestinationModel destination = DestinationModel.find.query().where().eq("id",id).eq("is_deleted",false).eq("company_id",userId).findOne();
            if (destination==null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_DESTINATION_NOTEXIST)));
            destination.setDeparture(body.get("departure").asText());
            destination.setArrival(body.get("arrival").asText());
            destination.setPrice(body.get("price").asInt());
            destination.setUpdatedAt(DateUtil.currentTime());
            destination.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.DESTINATION_SAVED_MESSAGE)));
    }

    public Result delete(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();

            DestinationModel destination = DestinationModel.find.query().where().eq("id", id).eq("is_deleted",false).findOne();
            if (destination == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_DESTINATION_NOTEXIST)));
            destination.setDeleted(true);
            destination.setDeletedAt(DateUtil.currentTime());
            destination.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.STATION_DELETED_MESSAGE)));
    }
}
