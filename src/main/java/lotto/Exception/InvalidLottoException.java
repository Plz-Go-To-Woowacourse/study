package lotto.Exception;

public class InvalidLottoException extends IllegalArgumentException{
    public InvalidLottoException(String errorMessage) {
        super(errorMessage);
    }
}
