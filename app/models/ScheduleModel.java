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
@Table(name = "schedules")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScheduleModel extends BaseModel {
    @Constraints.Required
    private String busPlateNo;
    @Constraints.Required
    private long departureDate;
    @Constraints.Required
    private int passengerLimit;
    private String status;
    private long createdAt = DateUtil.currentTime();
    private long updatedAt = DateUtil.currentTime();
    private boolean isDeleted;
    private long deletedAt = DateUtil.currentTime();
    @OneToOne
    @JoinColumn(name = "destination_id", referencedColumnName = "id")
    private DestinationModel destination;
    @OneToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private UsersModel company;
    @OneToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private UsersModel driver;
    public static Finder<Long,ScheduleModel> find = new Finder<Long,ScheduleModel>(ScheduleModel.class);

    public ScheduleModel(String busPlateNo, long departureDate, int passengerLimit, UsersModel company, DestinationModel destination, UsersModel driver) {
        this.busPlateNo = busPlateNo;
        this.departureDate = departureDate;
        this.passengerLimit = passengerLimit;
        this.company = company;
        this.destination = destination;
        this.driver = driver;
    }

    public String getBusPlateNo() {
        return busPlateNo;
    }

    public void setBusPlateNo(String busPlateNo) {
        this.busPlateNo = busPlateNo;
    }

    @Constraints.Required
    public long getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(long departureDate) {
        this.departureDate = departureDate;
    }

    @Constraints.Required
    public int getPassengerLimit() {
        return passengerLimit;
    }

    public void setPassengerLimit(int passengerLimit) {
        this.passengerLimit = passengerLimit;
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

    public UsersModel getCompany() {
        return company;
    }

    public void setCompany(UsersModel company) {
        this.company = company;
    }

    public DestinationModel getDestination() {
        return destination;
    }

    public void setDestination(DestinationModel destination) {
        this.destination = destination;
    }

    public UsersModel getDriver() {
        return driver;
    }

    public void setDriver(UsersModel driver) {
        this.driver = driver;
    }
}
