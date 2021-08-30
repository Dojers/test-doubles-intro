package test_doubles.transfer;

public class ApiServiceResponse {
    private String message;
    private boolean status;

    public ApiServiceResponse(boolean status, String message) {
        this.message = message;
        this.status = status;
    }

    public boolean hasError() {
        return status == false;
    }

    public String getMessage() {
        return message;
    }
}
