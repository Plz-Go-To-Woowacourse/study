package lotto.utils;

import lotto.exception.InvalidInputException;
import lotto.exception.message.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public void validateWinningNumber(List<String> winningNumbers) {
        for (String number : winningNumbers) {
            if (!isNumeric(number)) {
                throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_NUMERIC);
            }
        }

        if (winningNumbers.size() != 6) {
            throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_SIZE);
        }

        if (hasDuplicatedNumbers(winningNumbers)) {
            throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_DUPLICATED);
        }
    }

    private Boolean hasDuplicatedNumbers(List<String> winningNumbers) {
        Set<String> notDuplicated = new HashSet<>(winningNumbers);
        return notDuplicated.size() != winningNumbers.size();
    }

    public void validateBonusNumber(String bonusNumber) {
    }
}
