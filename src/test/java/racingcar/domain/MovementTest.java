package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.utils.MovementGenerator;

import static org.assertj.core.api.Assertions.assertThat;

class MovementTest {

    @DisplayName("자동차가 랜덤한 숫자 중 4 이상일 때만 전진하는지")
    @ParameterizedTest
    @CsvSource(value = {"3, 0", "4, 1"})
    void moveCarsTest(Integer generatorValue, Integer expectedPosition) {
        // given
        MovementGenerator movementGenerator = () -> generatorValue;
        Movement movement = new Movement(1);

        // when
        Integer actual = movement.move(movementGenerator);

        // then
        assertThat(actual).isEqualTo(expectedPosition);
    }
}