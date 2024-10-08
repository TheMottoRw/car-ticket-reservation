package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.CodeLabelDTO;
import dto.ErrorMessageDTO;
import dto.SuccessMessageDTO;
import helper.Constants;
import helper.DateUtil;
import helper.JWTAuthenticator;
import models.StationModel;
import models.DestinationModel;
import play.api.mvc.Request;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.List;

public class Stations extends Controller {
    @Inject
    JWTAuthenticator jwtAuthenticator;

    public Result save(Http.Request request) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            StationModel previousStation = null;
            System.out.println(body.toString());
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            DestinationModel destination = DestinationModel.find.query().where().eq("id", body.get("destination").asText()).eq("is_deleted",false).findOne();
            if(body.has("previous")){
                previousStation = StationModel.find.query().where().eq("id", body.get("previous").asText()).eq("is_deleted", false).findOne();
            }
            if (destination == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            int stationExist = StationModel.find.query().where().eq("name",body.get("name").asText()).eq("destination_id",body.get("destination").asText()).eq("is_deleted",false).findCount();
            if (stationExist>0)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_STATION_ALREADY_EXIST)));
            StationModel station = new StationModel(body.get("name").asText(),previousStation);

            station.setDestination(destination);
            station.save();

        }catch(Exception e){

            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.STATION_SAVED_MESSAGE)));
    }
    public Result findById(Http.Request request, String id) {
        StationModel destination = StationModel.find.byId(Long.valueOf(id));
        if (destination == null)
            return ok(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_STATION_NOTEXIST)));
        return ok(Json.toJson(destination));
    }
//    @Security.Authenticated
    public Result find(Http.Request request) {
        List<StationModel> destinations;
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            destinations = StationModel.find.nativeSql("SELECT s.* from stations s INNER JOIN destinations d ON d.id=s.destination_id WHERE  s.is_deleted=0 AND d.company_id='"+userId+"'").findList();
        }catch (Exception ex){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, ex.getMessage())));
        }
        return ok(Json.toJson(destinations));
    }
//    @Security.Authenticated
    public Result findStationsByDestination(Http.Request request,String destination) {
        List<StationModel> stations = StationModel.find.query().where().eq("destination_id", destination).eq("is_deleted", false).order("previous asc").findList();
//        if(stations.size()>0){
//            return ok(Json.toJson(stations.get(0)));
//        }
        return ok(Json.toJson(stations));
    }
//    @Security.Authenticated
    public Result findStationsHierarchy(Http.Request request,String destination) {
        StationModel stations = StationModel.find.nativeSql("SELECT s1.* FROM stations s1 LEFT JOIN stations s2 ON s1.id = s2.previous WHERE s2.previous IS NULL and s1.is_deleted=0 and s1.destination_id='"+destination+"'").findOne();
        List<StationModel> stationsDesc = StationModel.find.nativeSql("SELECT s1.* FROM stations s1 LEFT JOIN stations s2 ON s1.id = s2.previous WHERE s1.previous IS NULL and s2.is_deleted=0 and s1.destination_id='"+destination+"'").findList();

        return ok(Json.toJson(stations));
    }
    public Result update(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            StationModel previousStation = null;
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            StationModel station = StationModel.find.query().where().eq("id", id).eq("is_deleted",false).findOne();
            if (station == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_STATION_NOTEXIST)));
            DestinationModel destination = DestinationModel.find.query().where().eq("id", body.get("destination").asText()).eq("is_deleted",false).findOne();
            if(body.has("previous")){
                previousStation = StationModel.find.query().where().eq("id", body.get("previous").asText()).eq("is_deleted", false).findOne();
            }
            if (destination == null)
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, Constants.ERROR_UNAUTHORIZE_OPERATION)));
            station.setName(body.get("name").asText());
            station.setDestination(destination);
            station.setPreviousStation(previousStation);
            station.setUpdatedAt(DateUtil.currentTime());
            station.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.STATION_SAVED_MESSAGE)));
    }
    public Result delete(Http.Request request,String id) {
        try{
            String userId = jwtAuthenticator.parseData(request,"id");
            ObjectNode body = (ObjectNode) request.body().asJson();
            StationModel previousStation = null;
            if (body == null) {
                return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_OCCURRED, Constants.ERROR_OCCURED_MESSAGE)));
            }
            StationModel station = StationModel.find.query().where().eq("id", id).eq("is_deleted",false).findOne();
            station.setDeleted(true);
            station.setDeletedAt(DateUtil.currentTime());
            station.update();
        }catch(Exception e){
            return badRequest(Json.toJson(new ErrorMessageDTO(Constants.ERROR_NOTEXIST, e.getMessage())));
        }
        return ok(Json.toJson(new SuccessMessageDTO(Constants.SUCCESS, Constants.STATION_DELETED_MESSAGE)));
    }
}
