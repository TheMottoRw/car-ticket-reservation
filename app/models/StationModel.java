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
@Table(name = "stations")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StationModel extends BaseModel {
    @Constraints.Required
    private String name;
    private long createdAt = DateUtil.currentTime();
    private long updatedAt = DateUtil.currentTime();
    private boolean isDeleted;
    private long deletedAt = DateUtil.currentTime();
    @OneToOne
    @JoinColumn(name = "destination_id", referencedColumnName = "id")
    private DestinationModel destination;
    @OneToOne
    @JoinColumn(name = "previous", referencedColumnName = "id")
    private StationModel previousStation;
    public static Finder<Long,StationModel> find = new Finder<Long,StationModel>(StationModel.class);

    public StationModel(String name,StationModel previousStation) {
        this.name = name;
        this.previousStation = previousStation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public DestinationModel getDestination() {
        return destination;
    }

    public void setDestination(DestinationModel destination) {
        this.destination = destination;
    }

    public StationModel getPreviousStation() {
        return previousStation;
    }

    public void setPreviousStation(StationModel previousStation) {
        this.previousStation = previousStation;
    }
}