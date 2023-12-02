package baseball.domain;

import baseball.testObject.TestNumberGenerator;
import baseball.utils.NumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @DisplayName("3스트라이크가 되면 게임오버가 되는지")
    @Test
    void isGameOver() {
        // given
        final int[] numbers = {4,5,6};
        NumberGenerator numberGenerator = new TestNumberGenerator(numbers);
        ComputerNumber computerNumber = new ComputerNumber(numberGenerator);
        MyNumber myNumber = new MyNumber("456");

        Result result = new Result(myNumber, computerNumber);

        // when
        Boolean isGameOver = result.isGameOver();

        // then
        assertThat(isGameOver).isEqualTo(true);
    }

    @DisplayName("볼을 정상적으로 확인하는지")
    @ParameterizedTest
    @ValueSource(strings = {"147", "164", "564"})
    void testToString(String input) {
        // given
        final int[] numbers = {4,5,6};
        NumberGenerator numberGenerator = new TestNumberGenerator(numbers);
        ComputerNumber computerNumber = new ComputerNumber(numberGenerator);
        MyNumber myNumber = new MyNumber(input);

        Result result = new Result(myNumber, computerNumber);

        // when
        String resultMessage = result.toString();

        // then
        assertThat(resultMessage).contains("볼");
    }
}