package models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import helper.DateUtil;
import io.ebean.Finder;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import play.data.validation.Constraints;

@Entity
@Table(name = "driving_tracking")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DrivingTrackingModel extends BaseModel {
    private String status;
    private long createdAt = DateUtil.currentTime();
    private long updatedAt = DateUtil.currentTime();
    private boolean isDeleted;
    private long deletedAt = DateUtil.currentTime();
    @OneToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id")
    private ScheduleModel schedule;
    @OneToOne
    @JoinColumn(name = "current_station", referencedColumnName = "id")
    private StationModel currentStation;
    @OneToOne
    @JoinColumn(name = "previous", referencedColumnName = "id")
    private StationModel previousStation;
    public static Finder<Long,DrivingTrackingModel> find = new Finder<Long,DrivingTrackingModel>(DrivingTrackingModel.class);

    public DrivingTrackingModel(ScheduleModel schedule,StationModel currentStation,StationModel previousStation) {
        this.schedule = schedule;
        this.currentStation = currentStation;
        this.previousStation = previousStation;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
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

    public void setPreviousStation(StationModel previousStation) {
        this.previousStation = previousStation;
    }

    public StationModel getPreviousStation() {
        return previousStation;
    }
}