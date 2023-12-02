package baseball.domain;

import baseball.testObject.TestNumberGenerator;
import baseball.utils.NumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @Test
    void testToString() {
    }
}