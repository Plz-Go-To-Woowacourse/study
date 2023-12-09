package lotto.utils;

import lotto.exception.InvalidInputException;
import lotto.exception.message.ErrorMessage;

import java.util.List;

import static lotto.constants.ValidatorConstants.NUMERIC;

public class Validator {
    public void validatePrice(String price) {
        if (!isNumeric(price)) {
            throw new InvalidInputException(ErrorMessage.INVALID_PRICE_NUMERIC);
        }
    }

    private Boolean isNumeric(String price) {
        return price.matches(NUMERIC);
    }

    public void validateWinningNumber(List<String> winningNumbers) {
        for (String number : winningNumbers) {
            if (!isNumeric(number)) {
                throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_NUMERIC);
            }

            if (number.isEmpty()) {
                throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_EMPTY);
            }
        }
    }

    public void validateBonusNumber(String bonusNumber) {
        if (!isNumeric(bonusNumber)) {
            throw new InvalidInputException(ErrorMessage.INVALID_PRICE_NUMERIC);
        }

        if (bonusNumber.isEmpty()) {
            throw new InvalidInputException(ErrorMessage.INVALID_BONUS_NUMBER_EMPTY);
        }
    }
}
