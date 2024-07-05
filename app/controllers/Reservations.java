package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.ErrorMessageDTO;
import dto.SuccessMessageDTO;
import helper.Constants;
import helper.DateUtil;
import helper.JWTAuthenticator;
import models.*;
import models.ScheduleModel;
import play.api.mvc.Request;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import javax.swing.plaf.basic.ComboPopup;
import java.util.List;

public class Reservations extends Controller {
    @Inject
    JWTAuthenticator jwtAuthenticator;

    public Result save(Http.Request request) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            UsersModel passenger = UsersModel.find.query().where().eq("id",userId).eq("is_deleted",false).findOne();
            ScheduleModel schedule = ScheduleModel.find.query().where().eq("id", body.get("schedule").asText()).eq("is_deleted",false).findOne();
            StationModel station = StationModel.find.query().where().eq("id", body.get("station").asText()).eq("is_deleted",false).findOne();
            if (passenger == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.USER_NOTEXIST_MESSAGE)));
            if (schedule == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_SCHEDULE_NOTEXIST)));
            if (station == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_STATION_NOTEXIST)));
            int reservationExist = ReservationModel.find.query().where().eq("passenger_id",userId).eq("schedule_id",body.get("schedule").asText()).eq("pickup_station",body.get("station").asText()).findCount();
            if (reservationExist>0)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_RESERVATION_ALREADY_EXIST)));
            ReservationModel reservation = new ReservationModel(passenger,schedule,station);
            reservation.save();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.RESERVATION_SAVED_MESSAGE)));
    }
    public Result findById(Http.Request request, String id) {
        ReservationModel reservationModel = ReservationModel.find.byId(Long.valueOf(id));
        if (reservationModel == null)
            return ok(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_RESERVATION_NOTEXIST)));
        return ok(Json.toJson(reservationModel));
    }
//    @Security.Authenticated
    public Result find(Http.Request request) {
//        if(!jwtAuthenticator.parseData(request,"user_type").equals("admin")) return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
        List<ReservationModel> schedules = ReservationModel.find.query().where().eq("is_deleted", false).findList();
        return ok(Json.toJson(schedules));
    }
    public Result cancel(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            ReservationModel reservation = ReservationModel.find.query().where().eq("id",id).eq("passenger_id",userId).eq("is_deleted",false).findOne();
            if(reservation==null) badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED,Constants.ERROR_RESERVATION_NOTEXIST)));
            reservation.setDeleted(true);
            reservation.setDeletedAt(DateUtil.currentTime());
            reservation.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.RESERVATION_CANCELLED_MESSAGE)));
    }
}