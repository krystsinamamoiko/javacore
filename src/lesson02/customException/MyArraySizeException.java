package lesson02.customException;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String errorMessage) {
        super(errorMessage);
    }
}
