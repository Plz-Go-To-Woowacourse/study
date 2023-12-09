package lotto.exception;

import lotto.exception.message.ErrorMessage;

public class InvalidPriceInputException extends IllegalArgumentException {
    private ErrorMessage errorMessage;

    public InvalidPriceInputException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }
}
