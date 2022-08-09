package lesson02.customException;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String errorMessage) {
        super(errorMessage);
    }
}
