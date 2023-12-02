package baseball.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseBallServiceTest {
    private BaseBallService baseBallService;

    @BeforeEach
    void setUp() {
        baseBallService = new BaseBallService();
    }

    @DisplayName("1,2가 입력되지 않으면 예외처리를 하는지")
    @ParameterizedTest
    @ValueSource(strings = {"aa", "@sa", "3", "", " "})
    void isValid(String input) {
        // given & when & then
        assertThatThrownBy(() -> baseBallService.isValid(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}