package dto;

import models.DrivingTrackingModel;
import models.ScheduleModel;
import models.StationModel;

public class DrivingTrackDTO {
    private ScheduleModel schedule;
    private StationModel currentStation;
    private StationModel nextStation;
    private StationModel nextSecondStation;

    public DrivingTrackDTO(ScheduleModel schedule, StationModel currentStation, StationModel nextStation,StationModel nextSecondStation) {
        this.schedule = schedule;
        this.currentStation = currentStation;
        this.nextStation = nextStation;
        this.nextSecondStation = nextSecondStation;
    }

    public ScheduleModel getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleModel schedule) {
        this.schedule = schedule;
    }

    public StationModel getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(StationModel currentStation) {
        this.currentStation = currentStation;
    }

    public StationModel getNextStation() {
        return nextStation;
    }

    public void setNextStation(StationModel nextStation) {
        this.nextStation = nextStation;
    }

    public StationModel getNextSecondStation() {
        return nextSecondStation;
    }

    public void setNextSecondStation(StationModel nextSecondStation) {
        this.nextSecondStation = nextSecondStation;
    }
}
