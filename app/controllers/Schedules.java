package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.ErrorMessageDTO;
import dto.SuccessMessageDTO;
import helper.Constants;
import helper.DateUtil;
import helper.JWTAuthenticator;
import models.ScheduleModel;
import models.DestinationModel;
import models.UsersModel;
import play.api.mvc.Request;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import javax.swing.plaf.basic.ComboPopup;
import java.util.ArrayList;
import java.util.List;

public class Schedules extends Controller {
    @Inject
    JWTAuthenticator jwtAuthenticator;

    public Result save(Http.Request request) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            UsersModel company = UsersModel.find.query().where().eq("id",userId).eq("is_deleted",false).findOne();
            UsersModel driver = UsersModel.find.query().where().eq("id",body.get("driver").asText()).eq("is_deleted",false).findOne();
            DestinationModel destination = DestinationModel.find.query().where().eq("id", body.get("destination").asText()).eq("is_deleted",false).findOne();
            if (company == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            if (destination == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_DESTINATION_NOTEXIST)));
            if (driver == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_DRIVER_NOTEXIST)));
            int scheduleExist = ScheduleModel.find.query().where().eq("bus_plate_no",body.get("bus_plate_no").asText()).eq("departure_date",DateUtil.stringToDate(body.get("departure_date").asText()).getTime()).eq("destination_id",body.get("destination").asText()).findCount();
            if (scheduleExist>0)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_STATION_ALREADY_EXIST)));
            ScheduleModel schedule = new ScheduleModel(body.get("bus_plate_no").asText(),DateUtil.stringToDate(body.get("departure_date").asText()).getTime(),body.get("passenger_limit").asInt(), company,destination,driver);
            schedule.setDepartureDate(body.get("departure_date").asLong());
            schedule.save();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.SCHEDULE_SAVED_MESSAGE)));
    }
    public Result findById(Http.Request request, String id) {
        ScheduleModel destination = ScheduleModel.find.byId(Long.valueOf(id));
        if (destination == null)
            return ok(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_STATION_NOTEXIST)));
        return ok(Json.toJson(destination));
    }
//    @Security.Authenticated
    public Result find(Http.Request request) {
        List<ScheduleModel> schedules;
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            schedules = ScheduleModel.find.query().where().eq("is_deleted", false).eq("company_id", userId).findList();
        }catch (Exception ex){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED,ex.getMessage())));
        }
        return ok(Json.toJson(schedules));
    }
//    @Security.Authenticated
    public Result findNextStation(Http.Request request) {
//        if(!jwtAuthenticator.parseData(request,"user_type").equals("admin")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
        List<ScheduleModel> destinations = ScheduleModel.find.query().where().eq("is_deleted", false).findList();
        return ok(Json.toJson(destinations));
    }
//    @Security.Authenticated
    public Result findUpcoming(Http.Request request) {
//        if(!jwtAuthenticator.parseData(request,"user_type").equals("admin")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
        List<ScheduleModel> destinations = ScheduleModel.find.query().where().eq("is_deleted", false).gt("departure_date", DateUtil.currentTime()).eq("status","pending").findList();
        return ok(Json.toJson(destinations));
    }
//    @Security.Authenticated
    public Result findUpcomingByDriver(Http.Request request) {
        List<ScheduleModel> schedules = new ArrayList<>();
        try{
            String userId = jwtAuthenticator.parseData(request,"id"),
            userType = jwtAuthenticator.parseData(request,"user_type");
            if(!userType.equals("driver")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            schedules = ScheduleModel.find.query().where().eq("is_deleted", false).eq("driver_id", userId).gt("departure_date", DateUtil.currentTime()).not().eq("status","completed").endNot().findList();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(schedules));
    }
//    @Security.Authenticated
    public Result findHistoryByDriver(Http.Request request) {
        List<ScheduleModel> schedules = new ArrayList<>();
        try{
            String userId = jwtAuthenticator.parseData(request,"id"),
            userType = jwtAuthenticator.parseData(request,"user_type");
            if(!userType.equals("driver")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            schedules = ScheduleModel.find.query().where().eq("is_deleted", false).eq("driver_id", userId).or().eq("status","completed").lt("departure_date", DateUtil.currentTime()).findList();
        }catch(Exception ex){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(schedules));
    }
    public Result update(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            ScheduleModel schedule = ScheduleModel.find.query().where().eq("id",id).eq("is_deleted",false).findOne();
            UsersModel company = UsersModel.find.query().where().eq("id",userId).eq("is_deleted",false).findOne();
            UsersModel driver = UsersModel.find.query().where().eq("id",body.get("driver").asText()).eq("is_deleted",false).findOne();
            DestinationModel destination = DestinationModel.find.query().where().eq("id", body.get("destination").asText()).eq("is_deleted",false).findOne();
            if (schedule == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_SCHEDULE_NOTEXIST)));
            if (company == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            if (destination == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_DESTINATION_NOTEXIST)));
            if (driver == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_DRIVER_NOTEXIST)));
            int scheduleExist = ScheduleModel.find.query().where().eq("bus_plate_no",body.get("bus_plate_no").asText()).eq("departure_date",DateUtil.stringToDate(body.get("departure_date").asText()).getTime()).eq("destination_id",body.get("destination").asText()).findCount();
            if (scheduleExist>0)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_STATION_ALREADY_EXIST)));
            schedule.setBusPlateNo(body.get("bus_plate_no").asText());
            schedule.setPassengerLimit(body.get("passenger_limit").asInt());
            schedule.setDepartureDate(body.get("departure_date").asLong());
            schedule.setUpdatedAt(DateUtil.currentTime());
            schedule.setDestination(destination);
            schedule.setDriver(driver);
            schedule.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.SCHEDULE_SAVED_MESSAGE)));
    }
    public Result delete(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            ScheduleModel previousStation = null;
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            ScheduleModel schedule = ScheduleModel.find.query().where().eq("id", id).eq("is_deleted",false).findOne();
            schedule.setDeleted(true);
            schedule.setDeletedAt(DateUtil.currentTime());
            schedule.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.SCHEDULE_DELETED_MESSAGE)));
    }
}
