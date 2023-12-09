package lotto.domain;

import lotto.Exception.InvalidLottoException;
import lotto.constants.ErrorMessage;
import lotto.constants.LottoRule;

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
        validateLottoNumberCount(numbers);
        validateUniqueNumbers(numbers);
    }

    private void validateLottoNumberCount(List<Integer> numbers) {
        if (numbers.size() != LottoRule.LOTTO_NUMBER_COUNT.getValue()) {
            throw new InvalidLottoException(ErrorMessage.INVALID_LOTTO_COUNT.getText());
        }
    }

    private void validateUniqueNumbers(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        if (uniqueNumbers.size() != numbers.size()) {
            throw new InvalidLottoException(ErrorMessage.INVALID_UNIQUE_NUMBERS.getText());
        }
    }
}
