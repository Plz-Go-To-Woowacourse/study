package baseball.domain;

import baseball.constants.ErrorMessage;
import baseball.constants.Rule;
import baseball.exception.DuplicateNumberException;
import baseball.exception.InvalidNumberSizeException;
import baseball.utils.RandomNumberGenerator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumbers {
    private List<Integer> numbers;

    public BaseballNumbers(List<Integer> numbers) {
        validateSize(numbers);
        validateDuplicateNumber(numbers);
        this.numbers = numbers;
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != Rule.NUMBER_COUNT.getValue()) {
            throw new InvalidNumberSizeException(ErrorMessage.INVALID_NUMBER_SIZE.getText());
        }
    }

    private void validateDuplicateNumber(List<Integer> numbers) {
        Set<Integer> copyNumbers = new HashSet<>(numbers);

        if (copyNumbers.size() != numbers.size()) {
            throw new DuplicateNumberException(ErrorMessage.DUPLICATE_NUMBER.getText());
        }
    }
}
