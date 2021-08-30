package test_doubles.transfer;

public interface TransferApiService {
    ApiServiceResponse transfer(int accountOrigin, int accountDestiny, int amount);
}
