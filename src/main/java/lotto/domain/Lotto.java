package lotto.domain;

import lotto.Exception.InvalidLottoException;
import lotto.constants.ErrorMessage;
import lotto.constants.LottoRule;
import lotto.constants.Seperator;

import java.util.*;
import java.util.stream.Collectors;

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

    public boolean isDuplicateNumberFromLotto(int lottoNumber) {
        return numbers.stream()
                .anyMatch(number -> number == lottoNumber);
    }

    @Override
    public String toString() {
        return numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(Seperator.LOTTO_NUMBER.getValue()));
    }
}
