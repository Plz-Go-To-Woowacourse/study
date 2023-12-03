package racingcar.Service;

import racingcar.domain.RacingCar;
import racingcar.domain.Result;
import racingcar.utils.MovementGenerator;
import racingcar.utils.RandomMovementGenerator;

import java.util.List;

public class RaceService {
    public Result moveCars(RacingCar racingCar) {
        MovementGenerator randomMovementGenerator = new RandomMovementGenerator();
        List<Integer> moveResult = racingCar.move(randomMovementGenerator);

        return new Result(racingCar, moveResult);
    }
}
