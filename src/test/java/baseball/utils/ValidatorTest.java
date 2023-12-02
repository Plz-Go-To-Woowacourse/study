package baseball.utils;

import baseball.exception.BlankInputException;
import baseball.exception.InvalidNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidatorTest {
    private final Validator validator;

    public ValidatorTest() {
        validator = new Validator();
    }

    @DisplayName("빈 값을 입력하는 경우 예외를 발생 시킨다")
    @ValueSource(strings = {" ", "     "})
    @ParameterizedTest
    void validateBlankInput(String input) {
        assertThatThrownBy(() -> validator.validateBlankInput(input))
                .isInstanceOf(BlankInputException.class);
    }

    @DisplayName("숫자로만 이루어진 입력이 아닌 경우 예외를 발생 시킨다")
    @ValueSource(strings = {"1 12", "abc", "ab12cd"})
    @ParameterizedTest
    void validateNumber(String input) {
        assertThatThrownBy(() -> validator.validateNumber(input))
                .isInstanceOf(InvalidNumberException.class);
    }
}