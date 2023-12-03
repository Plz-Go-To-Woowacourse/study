package racingcar.Service;

import racingcar.domain.Movement;
import racingcar.domain.RacingCar;
import racingcar.domain.Result;
import racingcar.utils.MovementGenerator;
import racingcar.utils.RandomMovementGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RaceService {
    public Result move(RacingCar racingCar, Movement movement) {
        MovementGenerator movementGenerator = new RandomMovementGenerator();
        Map<String, Integer> result = racingCar.moveCars(movement, movementGenerator);

        return new Result(result);
    }

    public List<String> findWinners(List<Result> results) {
        Result finalResult = results.get(results.size() - 1);
        return finalResult.getWinners();
    }

    public List<Result> conductRace(RacingCar racingCar, Movement movement) {
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < movement.size(); i++) {
            Result result = move(racingCar, movement);
            results.add(result);
        }

        return results;
    }
}
