package test_doubles.transfer;

import org.junit.Assert;
import org.junit.Test;

public class TransferTest {

    @Test
    public void test() {

        // ARRANGE
        TransferApiService apiClient = new TransferApiServiceStub(false, "error transfer");
        ErrorStorage storage = new ErrorStorageSpy();
        TransferService service = new TransferService(apiClient, storage);

        int amount = 540000;
        int origin = 9823892;
        int destiny = 2982892;

        // ACT

        boolean response = service.transfer(origin, destiny, amount);

        // ASSERTS

        Assert.assertFalse(response); // confirm that transfer was rejected
        Assert.assertFalse(storage.isEmpty()); // confirm that message was saved
    }
}
