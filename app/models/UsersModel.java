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
@Table(name = "users")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UsersModel extends BaseModel{
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String phone;
    @Constraints.Required
    private String userType;
    @Constraints.Required
//    @JsonIgnore
    private String password;
    private boolean isVerified;
    private String resetVerificationCode;

    private long resetVerificationCodeExpiration;
    private String status="active";//locked
    private String address;

    private long lastLogin;

    private long createdAt= DateUtil.currentTime();

    private long updatedAt= DateUtil.currentTime();
    private boolean isDeleted;

    private long deletedAt= DateUtil.currentTime();
    @OneToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private UsersModel company;
    public static Finder<Long,UsersModel> find = new Finder<Long,UsersModel>(UsersModel.class);

    public UsersModel(String name, String email, String phone, String userType,UsersModel company) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.userType = userType;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getResetVerificationCode() {
        return resetVerificationCode;
    }

    public void setResetVerificationCode(String resetVerificationCode) {
        this.resetVerificationCode = resetVerificationCode;
    }

    public long getResetVerificationCodeExpiration() {
        return resetVerificationCodeExpiration;
    }

    public void setResetVerificationCodeExpiration(long resetVerificationCodeExpiration) {
        this.resetVerificationCodeExpiration = resetVerificationCodeExpiration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public UsersModel getCompany() {
        return company;
    }

    public void setCompany(UsersModel company) {
        this.company = company;
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

    public static void updateLogin(Long id){
        UsersModel userInfo = UsersModel.find.byId(id);
        if(userInfo!=null) {
            userInfo.setLastLogin(DateUtil.currentTime());
            userInfo.update();
        }
    }
}
