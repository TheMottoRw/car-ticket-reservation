package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.DrivingTrackDTO;
import dto.ErrorMessageDTO;
import dto.SuccessMessageDTO;
import helper.Constants;
import helper.JWTAuthenticator;
import models.DrivingTrackingModel;
import models.ScheduleModel;
import models.StationModel;
import models.UsersModel;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class DrivingTracking extends Controller {
    @Inject
    public JWTAuthenticator jwtAuthenticator;

    public Result startDriving(Http.Request request) {
        try {
            ObjectNode body = (ObjectNode) request.body().asJson();
            String userId = jwtAuthenticator.parseData(request, "id"),
                    userType = jwtAuthenticator.parseData(request, "user_type");
            UsersModel driver = UsersModel.find.query().where().eq("id", userId).eq("user_type", "driver").eq("is_deleted", false).findOne();
            if (driver == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
            ScheduleModel schedule = ScheduleModel.find.query().where().eq("id", body.get("schedule").asText()).eq("driver_id", userId).eq("is_deleted", false).findOne();
            if (schedule == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_SCHEDULE_NOTEXIST)));
            //create stations tracking
            List<StationModel> driveTrack = StationModel.find.query().where().eq("is_deleted", false).eq("destination_id", schedule.getDestination().getId()).findList();
            for (StationModel station : driveTrack) {
                DrivingTrackingModel driveTracking = new DrivingTrackingModel(schedule, station, station.getPreviousStation());
                driveTracking.save();
            }
            //update schedule to driving
            schedule.setStatus("inprogress");
            schedule.update();
            DrivingTrackingModel drivingTrackingModel = DrivingTrackingModel.find.nativeSql("SELECT * FROM driving_tracking WHERE schedule_id='" + schedule.getId().toString() + "' and previous is null").findOne();
            if (drivingTrackingModel == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_STATION_NOTEXIST)));
            return ok(Json.toJson(drivingTrackingModel));
        } catch (Exception e) {
            System.out.println(e);
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, e.getMessage())));
        }
    }

    public Result stationArrival(Http.Request request) {
        try {
            ObjectNode body = (ObjectNode) request.body().asJson();
            String userId = jwtAuthenticator.parseData(request, "id"),
                    userType = jwtAuthenticator.parseData(request, "user_type");
            UsersModel user = UsersModel.find.query().where().eq("id", userId).eq("is_deleted", false).findOne();
            if (user == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
            ScheduleModel schedule = ScheduleModel.find.query().where().eq("id", body.get("schedule").asText()).eq("is_deleted", false).findOne();
            if (schedule == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_SCHEDULE_NOTEXIST)));
            DrivingTrackingModel track = DrivingTrackingModel.find.query().where().eq("is_deleted", false).eq("previous", body.get("station").asText()).findOne();
            if (track == null) {
                //update schedule
                schedule.setStatus("completed");
                schedule.update();
                return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, "Arrived at the destination")));
            }

            return ok(Json.toJson(track));
        } catch (Exception e) {
            System.out.println(e);
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, e.getMessage())));
        }
    }

    public Result track(Http.Request request) {
        try {
            ObjectNode body = (ObjectNode) request.body().asJson();
            String userId = jwtAuthenticator.parseData(request, "id"),
                    userType = jwtAuthenticator.parseData(request, "user_type");
            StationModel previousStation=null,nextStation=null,nextSecondStation=null;
            UsersModel user = UsersModel.find.query().where().eq("id", userId).eq("is_deleted", false).findOne();
            if (user == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.USER_NOTEXIST_MESSAGE)));
            ScheduleModel schedule = ScheduleModel.find.query().where().eq("id", body.get("schedule").asText()).eq("is_deleted", false).findOne();
            if (schedule == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_SCHEDULE_NOTEXIST)));
            List<DrivingTrackingModel> lstPrev = DrivingTrackingModel.find.nativeSql("SELECT * FROM driving_tracking drt WHERE drt.schedule_id='"+body.get("schedule").asText()+"' and is_deleted='0' and status='arrived' order by updated_at desc").findList();
            if(!lstPrev.isEmpty()) previousStation = lstPrev.get(0).getCurrentStation();
            if (!lstPrev.isEmpty()) {
                List<DrivingTrackingModel> nextStopList = DrivingTrackingModel.find.nativeSql("SELECT * FROM driving_tracking drt WHERE drt.schedule_id='" + body.get("schedule").asText() + "' and is_deleted='0' and status='pending' and drt.previous='" + previousStation.getId() + "' order by updated_at desc").findList();
                if (!nextStopList.isEmpty()) nextStation = nextStopList.get(0).getCurrentStation();
                if (nextStation != null) {
                    List<DrivingTrackingModel> next2ndStopList = DrivingTrackingModel.find.nativeSql("SELECT * FROM driving_tracking drt WHERE drt.schedule_id='" + body.get("schedule").asText() + "' and is_deleted='0' and status='pending' and drt.previous='" + nextStation.getId() + "' order by updated_at desc").findList();
                    if (!next2ndStopList.isEmpty()) nextSecondStation = next2ndStopList.get(0).getCurrentStation();
                }
            }

            return ok(Json.toJson(new DrivingTrackDTO(schedule,previousStation,nextStation,nextSecondStation)));
        } catch (Exception e) {
            System.out.println(e);
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, e.getMessage())));
        }
    }
}
