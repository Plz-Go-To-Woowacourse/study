package lotto.domain;

import lotto.domain.vo.BonusNumber;
import lotto.exception.InvalidInputException;
import lotto.exception.message.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

        if (hasDuplicatedNumbers(numbers)) {
            throw new InvalidInputException(ErrorMessage.LOTTO_DUPLICATED);
        }
    }

    private Boolean hasDuplicatedNumbers(List<Integer> numbers) {
        Set<Integer> notDuplicated = new HashSet<>(numbers);
        return notDuplicated.size() != numbers.size();
    }

    // TODO: 추가 기능 구현

    @Override
    public String toString() {
        return numbers.toString();
    }

    public Integer countNumber(List<Integer> winningNumbers, BonusNumber bonusNumber) {
        Integer matchingNumber = 0;

        for (Integer number : numbers) {
            if (hasWinningNumber(winningNumbers, number, bonusNumber)) {
                matchingNumber++;
            }
        }

        return matchingNumber;
    }

    private Boolean hasWinningNumber(List<Integer> winningNumbers, Integer number, BonusNumber bonusNumber) {
        return winningNumbers.contains(number) && !bonusNumber.hasBonusNumber(number);
    }

    public Boolean isCorrectBonusNumber(BonusNumber bonusNumber) {
        return bonusNumber.hasBonusNumberInList(this.numbers);
    }
}
