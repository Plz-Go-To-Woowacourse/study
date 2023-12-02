package baseball.exception;

public class InvalidNumberSizeException extends IllegalArgumentException{
    public InvalidNumberSizeException(String errorMessage) {
        super(errorMessage);
    }
}