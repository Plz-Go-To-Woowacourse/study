package racingcar.service;

import racingcar.constants.Rule;
import racingcar.domain.Car;
import racingcar.utils.RandomNumberGenerator;

import java.util.Map;

public class RacingCarService {
    final private Map<Car, Integer> racingResult;

    public RacingCarService(Map<Car, Integer> racingResult) {
        this.racingResult = racingResult;
    }

    private void forwardCar(Car car) {
        int move = racingResult.get(car) + 1;
        racingResult.put(car, move);
    }

    public void moveCar(Car car, int randomNumber) {
        if (randomNumber >= Rule.MOVE_STANDARD_NUMBER.getValue()) {
            forwardCar(car);
        }
    }
}
