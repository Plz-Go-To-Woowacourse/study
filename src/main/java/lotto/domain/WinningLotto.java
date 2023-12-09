package lotto.domain;

import lotto.domain.vo.BonusNumber;
import lotto.exception.InvalidInputException;
import lotto.exception.payload.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WinningLotto {
    private final List<Integer> winningNumbers;
    private final BonusNumber bonusNumber;

    public WinningLotto(List<Integer> winningNumbers, String bonusNumber) {
        validate(winningNumbers);
        this.winningNumbers = winningNumbers;
        this.bonusNumber = new BonusNumber(bonusNumber);
    }

    private void validate(List<Integer> winningNumbers) {
        if (hasDuplicatedNumbers(winningNumbers)) {
            throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_DUPLICATED);
        }

        if (winningNumbers.size() != 6) {
            throw new InvalidInputException(ErrorMessage.INVALID_WINNING_NUMBER_SIZE);
        }
    }

    private Boolean hasDuplicatedNumbers(List<Integer> winningNumbers) {
        Set<Integer> notDuplicated = new HashSet<>(winningNumbers);
        return notDuplicated.size() != winningNumbers.size();
    }

    public Integer countCorrectNumber(Lotto lotto) {
        return lotto.countNumber(this.winningNumbers, this.bonusNumber);
    }

    public Boolean isCorrectBonusNumber(Lotto lotto) {
        return lotto.isCorrectBonusNumber(bonusNumber);
    }
}
