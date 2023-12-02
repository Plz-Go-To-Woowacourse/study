package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MyNumberTest {

    private static Stream<Arguments> myNumbers() {
        return Stream.of(
                Arguments.arguments(new MyNumber("123"), "123"),
                Arguments.arguments(new MyNumber("456"), "456"),
                Arguments.arguments(new MyNumber("789"), "789")
        );
    }

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

    @DisplayName("리스트 인덱스 값을 가져오는지")
    @ParameterizedTest
    @MethodSource("myNumbers")
    void getNumberIndex(MyNumber myNumber, String expectedNumbers) {
        for (int i = 0; i < expectedNumbers.length(); i ++) {
            // given
            Integer expected = Character.getNumericValue(expectedNumbers.charAt(i));

            // when
            Integer actual = myNumber.getNumberIndex(i);

            // then
            assertThat(expected).isEqualTo(actual);
        }
    }
}