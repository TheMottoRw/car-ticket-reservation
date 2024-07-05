package dto;

import models.UsersModel;

public class LoginDTO {
    private String token;
    private UsersModel data;

    public LoginDTO(String token, UsersModel usersModel) {
        this.token = token;
        this.data = usersModel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UsersModel getData() {
        return data;
    }

    public void setData(UsersModel usersModel) {
        this.data = usersModel;
    }
}
