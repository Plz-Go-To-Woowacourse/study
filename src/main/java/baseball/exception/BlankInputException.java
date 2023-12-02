package baseball.exception;

public class BlankInputException extends IllegalArgumentException{
    public BlankInputException(String errorMessage) {
        super(errorMessage);
    }
}
