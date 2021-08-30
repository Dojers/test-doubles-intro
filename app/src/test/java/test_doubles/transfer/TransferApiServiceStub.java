package test_doubles.transfer;

public class TransferApiServiceStub implements TransferApiService {

    private boolean transferStatus;
    private String transferMessage;

    public TransferApiServiceStub(boolean status, String message) {
        transferStatus = status;
        transferMessage = message;

    }

    public ApiServiceResponse transfer(int accountOrigin, int accountDestiny, int amount) {
        return new ApiServiceResponse(transferStatus, transferMessage);
    }
}
