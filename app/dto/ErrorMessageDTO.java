package dto;

public class ErrorMessageDTO {
    public String error;
    public String message;
    public String detail;
    public boolean status=false;

    public ErrorMessageDTO(String error,String message) {
        this.error = error;
        this.message = message;
    }
    public ErrorMessageDTO(String error,String message,String errorDetail) {
        this.error = error;
        this.message = message;
        this.detail = errorDetail;
    }
}
