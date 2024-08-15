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
@Table(name = "reservations")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReservationModel extends BaseModel {
    private int price;
    private String status="active";
    private long createdAt = DateUtil.currentTime();
    private long updatedAt = DateUtil.currentTime();
    private boolean isDeleted;
    private long deletedAt = DateUtil.currentTime();
    @OneToOne
    @JoinColumn(name = "passenger_id", referencedColumnName = "id")
    private UsersModel passenger;
    @OneToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id")
    private ScheduleModel schedule;
    @OneToOne
    @JoinColumn(name = "pickup_station", referencedColumnName = "id")
    private StationModel pickupStation;
    public static Finder<Long,ReservationModel> find = new Finder<Long,ReservationModel>(ReservationModel.class);

    public ReservationModel(UsersModel passenger, ScheduleModel schedule, StationModel pickupStation) {
        this.passenger = passenger;
        this.schedule = schedule;
        this.pickupStation = pickupStation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public UsersModel getPassenger() {
        return passenger;
    }

    public void setPassenger(UsersModel passenger) {
        this.passenger = passenger;
    }

    public ScheduleModel getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleModel schedule) {
        this.schedule = schedule;
    }

    public StationModel getPickupStation() {
        return pickupStation;
    }

    public void setPickupStation(StationModel pickupStation) {
        this.pickupStation = pickupStation;
    }
}
