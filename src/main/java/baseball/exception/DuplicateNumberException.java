package baseball.exception;

public class DuplicateNumberException extends IllegalArgumentException{
    public DuplicateNumberException(String errorMessage) {
        super(errorMessage);
    }
}
