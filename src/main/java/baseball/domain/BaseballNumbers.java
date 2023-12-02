package baseball.domain;

import baseball.constants.ErrorMessage;
import baseball.constants.Rule;
import baseball.exception.DuplicateNumberException;
import baseball.exception.InvalidNumberSizeException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

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

    public int countBall(BaseballNumbers baseballNumbers) {
        AtomicInteger index = new AtomicInteger(0);

        return (int) numbers.stream()
                .filter(number -> {
                    int currentIndex = index.getAndIncrement();
                    return baseballNumbers.isBall(currentIndex, number);
                })
                .count();
    }

    private boolean isBall(int currentIndex, int number) {
        int index = findNumberIndex(number);

        return index != Rule.NO_NUMBER.getValue()
                && currentIndex != index;
    }

    private boolean isStrike(int currentIndex, int number) {
        int index = findNumberIndex(number);

        return index != Rule.NO_NUMBER.getValue()
                && currentIndex == index;
    }

    private int findNumberIndex(int number) {
        return IntStream
                .range(0, numbers.size())
                .filter(index -> numbers.get(index) == number)
                .findFirst()
                .orElse(Rule.NO_NUMBER.getValue());
    }

    @Override
    public String toString() {
        return "BaseballNumbers{" +
                "numbers=" + numbers +
                '}';
    }
}
