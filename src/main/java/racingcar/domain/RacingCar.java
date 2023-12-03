package racingcar.domain;

import racingcar.utils.MovementGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingCar {
    private final List<String> carNames;
    private final Map<String, Integer> carPositions = new HashMap<>();

    public RacingCar(List<String> carNames) {
        this.carNames = carNames;
        for (String carName : carNames) {
            carPositions.put(carName, 0);
        }
    }

    public Map<String, Integer> moveCars(Movement movement, MovementGenerator movementGenerator) {
        for (String carName : carNames) {
            Integer currentPosition = carPositions.get(carName);
            Integer movedPosition = movement.move(movementGenerator);

            carPositions.put(carName, currentPosition + movedPosition);
        }

        return carPositions;
    }
}
