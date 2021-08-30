package test_doubles.transfer;

import java.util.List;
import java.util.ArrayList;

public class ErrorStorageSpy implements ErrorStorage {

    List<String> messages = new ArrayList<String>();

    public void save(String message) {
        this.messages.add(message);
    }

    public boolean isEmpty() {
        return this.messages.isEmpty();
    }
}
