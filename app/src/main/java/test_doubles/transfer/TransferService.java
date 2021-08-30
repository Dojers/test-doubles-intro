package test_doubles.transfer;

public class TransferService {

    private TransferApiService apiService;
    private ErrorStorage errorStorage;

    private boolean ACCEPTED = true;
    private boolean REJECTED = false;

    public TransferService(TransferApiService apiClient, ErrorStorage storage) {
        apiService = apiClient;
        errorStorage = storage;
    }

    public boolean transfer(int accountOrigin, int accountDestiny, int amount) {

        ApiServiceResponse response = apiService.transfer(accountOrigin, accountDestiny, amount);

        if (response.hasError()) {
            errorStorage.save(response.getMessage());
            return REJECTED;
        }

        // when transfer was executed successfully
        return ACCEPTED;

    }

}