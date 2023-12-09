package lotto.domain;

import lotto.Exception.InvalidLottoException;
import lotto.constants.ErrorMessage;

public class BonusNumber {
    private int number;

    public BonusNumber(int number, Lotto winningNumber) {
        validate(number, winningNumber);
        this.number = number;
    }

    private void validate(int number, Lotto winningNumber) {
        if (winningNumber.isDuplicateNumberFromLotto(number)){
            throw new InvalidLottoException(ErrorMessage.INVALID_BONUS_NUMBER.getText());
        }
    }
}
