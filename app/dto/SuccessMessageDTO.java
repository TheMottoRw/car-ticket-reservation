package dto;

public class SuccessMessageDTO {
    public String success;
    public String message;
    public boolean status=true;

    public SuccessMessageDTO(String success, String message) {
        this.success = success;
        this.message = message;
    }
}
