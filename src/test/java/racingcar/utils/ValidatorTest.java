package racingcar.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidatorTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @DisplayName("자동차명에 숫자가 들어갔는지")
    @Test
    void validateCarNamesNumericTest() {
        List<String> carNames = List.of(" pobi1", "232", "j3n", "w52n");
        assertThatThrownBy(() -> validator.validateCarNames(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차명에 공백 및 빈값이 들어갔는지")
    @Test
    void validateCarNamesBlankTest() {
        List<String> carNames = List.of(" pobi", "", "j n", "woni ");
        assertThatThrownBy(() -> validator.validateCarNames(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("움직임에 공백 및 빈값이 들어갔는지")
    @ParameterizedTest
    @ValueSource(strings = {" ", "", "5 ", " 6"})
    void validateMovementBlankTest(String movement) {
        assertThatThrownBy(() -> validator.validateMovement(movement))
                .isInstanceOf(IllegalArgumentException.class);
    }
}