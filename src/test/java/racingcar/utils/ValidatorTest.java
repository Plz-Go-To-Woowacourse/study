package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @DisplayName("숫자 이외의 문자를 입력 하는 경우 예외를 발생 시킨다")
    @ValueSource(strings = {"12v", "abc", "1 2"})
    @ParameterizedTest
    void validateNumber(String number) {
        Validator validator = new Validator();

        assertThatThrownBy(() -> validator.validateNumber(number))
                .isInstanceOf(IllegalArgumentException.class);
    }
}