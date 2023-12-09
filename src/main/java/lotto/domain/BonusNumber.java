package lotto.domain;

import lotto.Exception.InvalidLottoException;
import lotto.constants.ErrorMessage;
import lotto.constants.LottoRule;

public class BonusNumber {
    private int number;

    public BonusNumber(int number, Lotto winningLotto) {
        validate(number, winningLotto);
        this.number = number;
    }

    private void validate(int number, Lotto winningLotto) {
        validateLottoNumber(number);
        validateDuplicateNumber(number, winningLotto);
    }

    private void validateDuplicateNumber(int number, Lotto winningLotto) {
        if (winningLotto.isDuplicateNumberFromLotto(number)){
            throw new InvalidLottoException(ErrorMessage.INVALID_BONUS_NUMBER.getText());
        }
    }

    private void validateLottoNumber(int number) {
        if (number < LottoRule.START_LOTTO_NUMBER.getValue()
                || number > LottoRule.END_LOTTO_NUMBER.getValue()) {
            throw new InvalidLottoException(ErrorMessage.INVALID_LOTTO_NUMBER.getText());
        }
    }
}
