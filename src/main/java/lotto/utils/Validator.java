package lotto.utils;

import lotto.exception.InvalidInputException;
import lotto.exception.message.ErrorMessage;

import static lotto.constants.ValidatorConstants.NUMERIC;

public class Validator {
    public void validatePrice(String price) {
        if (!isNumeric(price)) {
            throw new InvalidInputException(ErrorMessage.INVALID_PRICE);
        }
    }

    private Boolean isNumeric(String price) {
        return price.matches(NUMERIC);
    }

    public void validateWinningNumber(String winningNumber) {
    }

    public void validateBonusNumber(String bonusNumber) {
    }
}
