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
@Table(name = "destinations")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DestinationModel extends BaseModel {
    @Constraints.Required
    private String departure;
    @Constraints.Required
    private String arrival;
    @Constraints.Required
    private int price;
    private long createdAt = DateUtil.currentTime();
    private long updatedAt = DateUtil.currentTime();
    private boolean isDeleted;
    private long deletedAt = DateUtil.currentTime();
    @OneToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private UsersModel company;
    public static Finder<Long,DestinationModel> find = new Finder<Long,DestinationModel>(DestinationModel.class);

    public DestinationModel(String departure, String arrival, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
}