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
                Arguments.of(new int[] {1,2,3}, 0, 1),
                Arguments.of(new int[] {1,2,3}, 1, 2),
                Arguments.of(new int[] {1,2,3}, 2, 3),
                Arguments.of(new int[] {4,5,6}, 0, 4),
                Arguments.of(new int[] {4,5,6}, 1, 5),
                Arguments.of(new int[] {4,5,6}, 2, 6)
        );
    }

    @DisplayName("생성한 숫자의 인덱스를 가져오는지")
    @ParameterizedTest
    @MethodSource("computerNumbers")
    void getNumberIndex(int[] numbers, int index, int expectedNumber) {
        // given
        NumberGenerator numberGenerator = new TestNumberGenerator(numbers);
        ComputerNumber computerNumber = new ComputerNumber(numberGenerator);

        // when
        Integer actual = computerNumber.getNumberIndex(index);

        // then
        assertThat(actual).isEqualTo(expectedNumber);
    }

    @DisplayName("해당 숫자가 포함되어있는지 확인")
    @Test
    void contains() {
    }
}