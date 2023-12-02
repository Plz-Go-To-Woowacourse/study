package baseball.exception;

public class InvalidAttemptException extends IllegalArgumentException{
    public InvalidAttemptException(String errorMessage) {
        super(errorMessage);
    }
}
