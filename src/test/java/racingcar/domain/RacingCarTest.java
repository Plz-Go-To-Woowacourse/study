package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.MovementGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarTest {

    @DisplayName("움직인 횟수를 저장하고 있는지")
    @Test
    void moveCarsTest() {
        // given
        int expectedValue = 0;
        List<String> carNames = Arrays.asList("pobi", "woni", "jun");
        RacingCar racingCar = new RacingCar(carNames);

        Movement movement = new Movement(5);
        MovementGenerator movementGenerator = () -> 5;

        // when & then
        for (int i = 1; i < 6; i++) {
            Map<String, Integer> actual = racingCar.moveCars(movement, movementGenerator);

            for (Map.Entry<String, Integer> entry : actual.entrySet()) {
                int currentPosition = entry.getValue();
                assertThat(expectedValue + i).isEqualTo(currentPosition);
            }
        }
    }
}