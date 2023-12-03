package racingcar.domain;

import racingcar.utils.MovementGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingCar {
    private final List<String> carNames;
    private final Movement movement;

    public RacingCar(List<String> carNames, Integer movement) {
        this.carNames = carNames;
        this.movement = new Movement(movement);
    }

    public List<Integer> move(MovementGenerator movementGenerator) {
        List<Integer> movementResult = new ArrayList<>();
        for (String carName : carNames) {
            Integer moveCount = movement.move(movementGenerator);
            movementResult.add(moveCount);
        }

        return movementResult;
    }

    public Map<String, Integer> getNameToMoveCountMap(List<Integer> moveResult) {
        Map<String, Integer> nameToMoveCountMap = new HashMap<>();
        for (int i = 0; i < carNames.size(); i++) {
            nameToMoveCountMap.put(carNames.get(i), moveResult.get(i));
        }

        return nameToMoveCountMap;
    }
}
