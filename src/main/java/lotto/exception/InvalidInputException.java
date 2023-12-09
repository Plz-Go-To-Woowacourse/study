package lotto.exception;

import lotto.exception.message.ErrorMessage;

public class InvalidInputException extends IllegalArgumentException {
    public InvalidInputException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
    }
}
