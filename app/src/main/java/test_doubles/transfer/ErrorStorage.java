package test_doubles.transfer;

public interface ErrorStorage {
    void save(String message);

    boolean isEmpty();
}
