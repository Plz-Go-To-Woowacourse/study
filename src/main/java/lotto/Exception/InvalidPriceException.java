package lotto.Exception;

public class InvalidPriceException extends IllegalArgumentException{
    public InvalidPriceException(String errorMessage) {
        super(errorMessage);
    }
}
