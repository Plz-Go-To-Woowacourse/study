package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MyNumberTest {

    @DisplayName("공백을 입력했을 경우 예외처리를 하는지")
    @ParameterizedTest
    @ValueSource(strings = {" 23", "5 1"})
    void hasBlankTest(String input) {
        // given & when & then
        assertThatThrownBy(() -> new MyNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("숫자가 아닌 값을 입력했을 경우 예외처리를 하는지")
    @ParameterizedTest
    @ValueSource(strings = {"일이삼", "@ㅁㅌ", "12#"})
    void isNumericTest(String input) {
        // given & when & then
        assertThatThrownBy(() -> new MyNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void getNumberIndex() {
    }
}