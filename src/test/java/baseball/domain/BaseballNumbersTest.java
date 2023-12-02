package baseball.domain;

import baseball.constants.Rule;
import baseball.exception.DuplicateNumberException;
import baseball.exception.InvalidNumberException;
import baseball.exception.InvalidNumberSizeException;
import baseball.utils.RandomNumberGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BaseballNumbersTest {

    private List<Integer> createOverSizeNumbers(int size) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    @DisplayName("야구 숫자 개수가 3개를 넘어가는 경우 예외를 발생 시킨다")
    @Test
    void checkOverSizeNumbers() {
        List<Integer> numbers = createOverSizeNumbers(10);

        assertThatThrownBy(() -> new BaseballNumbers(numbers))
                .isInstanceOf(InvalidNumberSizeException.class);
    }

    @DisplayName("야구 숫자 입력이 중복되는 경우 예외를 발생 시킨다")
    @Test
    void checkDuplicateNumbers() {
        List<Integer> numbers = List.of(1, 3, 3);

        assertThatThrownBy(() -> new BaseballNumbers(numbers))
                .isInstanceOf(DuplicateNumberException.class);
    }

    @DisplayName("유저와 컴퓨터의 숫자를 비교해 볼 개수를 확인한다")
    @Test
    void countBall() {
        BaseballNumbers computerNumbers = new BaseballNumbers(new ArrayList<>(Arrays.asList(1, 3, 4)));
        BaseballNumbers userNumbers = new BaseballNumbers(new ArrayList<>(Arrays.asList(3, 5, 9)));

        Assertions.assertEquals(computerNumbers.countBall(userNumbers), 1);
    }

    @DisplayName("유저와 컴퓨터의 숫자를 비교해 스트라이크 개수를 확인한다")
    @Test
    void countStrike() {
        BaseballNumbers computerNumbers = new BaseballNumbers(new ArrayList<>(Arrays.asList(1, 3, 4)));
        BaseballNumbers userNumbers = new BaseballNumbers(new ArrayList<>(Arrays.asList(1, 5, 4)));

        Assertions.assertEquals(computerNumbers.countStrike(userNumbers), 2);
    }
}