package baseball.exception;

public class InvalidNumberException extends IllegalArgumentException{
    public InvalidNumberException(String errorMessage) {
        super(errorMessage);
    }
}
