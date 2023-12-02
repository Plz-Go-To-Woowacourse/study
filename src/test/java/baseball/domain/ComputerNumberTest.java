package baseball.domain;

import baseball.testObject.TestNumberGenerator;
import baseball.utils.NumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerNumberTest {

    private static Stream<Arguments> computerNumbers() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3}, 1, true),
                Arguments.of(new int[] {1,2,3}, 4, false)
        );
    }

    @DisplayName("생성한 숫자의 인덱스를 가져오는지")
    @Test
    void getNumberIndex() {
        // given
        final int[] numbers = {4,5,6};
        NumberGenerator numberGenerator = new TestNumberGenerator(numbers);
        ComputerNumber computerNumber = new ComputerNumber(numberGenerator);

        // when & then
        for (int i = 0; i < 3; i++) {
            Integer actual = computerNumber.getNumberIndex(i);
            assertThat(actual).isEqualTo(numbers[i]);
        }
    }

    @DisplayName("해당 숫자가 포함되어있는지 확인하는지")
    @ParameterizedTest
    @MethodSource("computerNumbers")
    void contains(int[] numbers, Integer number, Boolean expected) {
        // given
        NumberGenerator numberGenerator = new TestNumberGenerator(numbers);
        ComputerNumber computerNumber = new ComputerNumber(numberGenerator);

        // when
        Boolean actual = computerNumber.contains(number);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}