package racingcar.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidatorTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @DisplayName("자동차 명에 공백 및 빈값이 들어갔는지")
    @Test
    void validateCarNamesBlankTest() {
        List<String> carNames = List.of(" pobi", "", "j n", "woni ");
        assertThatThrownBy(() -> validator.validateCarNames(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validateMovement() {
    }
}