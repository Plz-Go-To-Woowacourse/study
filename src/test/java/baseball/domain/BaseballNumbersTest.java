package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BaseballNumbersTest {

    @DisplayName("유저와 컴퓨터의 숫자를 비교해 볼 개수를 확인한다")
    @Test
    void countBall() {
        BaseballNumbers computerNumbers = new BaseballNumbers(new ArrayList<>(Arrays.asList(1, 3, 4)));
        BaseballNumbers userNumbers = new BaseballNumbers(new ArrayList<>(Arrays.asList(3, 5, 9)));

        Assertions.assertEquals(computerNumbers.countBall(userNumbers), 1);
    }
}