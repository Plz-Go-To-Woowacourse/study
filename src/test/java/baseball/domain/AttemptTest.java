package baseball.domain;

import baseball.exception.InvalidAttemptException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AttemptTest {
    @DisplayName("게임 종료 후 재도전 여부를 입력 받을 때 1, 2 이외의 값 입력시 예외를 발생 시킨다")
    @ValueSource(ints = {0, -1, 12, 3, 4})
    @ParameterizedTest
    void createAttempt(int userInput) {
        assertThatThrownBy(() -> new Attempt(userInput))
                .isInstanceOf(InvalidAttemptException.class);
    }

    @DisplayName("2가 아닌 다른 메뉴를 입력한 경우 게임 종료가 아님을 확인 한다")
    @Test
    void continueGame() {
        Attempt attempt = new Attempt(1);
        Assertions.assertFalse(attempt.isEnd());
    }

    @DisplayName("2입력시 게임 종료 임을 확인 한다")
    @Test
    void endGame() {
        Attempt attempt = new Attempt(2);
        Assertions.assertTrue(attempt.isEnd());
    }
}