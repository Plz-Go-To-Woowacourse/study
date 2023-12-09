package lotto.domain.vo;

import lotto.exception.InvalidInputException;
import lotto.exception.message.ErrorMessage;

import java.util.List;

public class BonusNumber {
    private final Integer bonusNumber;

    public BonusNumber(String bonusNumber) {
        validate(bonusNumber);
        this.bonusNumber = Integer.parseInt(bonusNumber);
    }

    private void validate(String bonusNumber) {
        if (bonusNumber.length() != 1) {
            throw new InvalidInputException(ErrorMessage.INVALID_BONUS_NUMBER_SIZE);
        }
    }

    public Boolean hasBonusNumber(Integer number) {
        return number.equals(this.bonusNumber);
    }

    public Boolean hasBonusNumberInList(List<Integer> numbers) {
        return numbers.contains(this.bonusNumber);
    }
}
