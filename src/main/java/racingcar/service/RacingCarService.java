package racingcar.service;

import racingcar.constants.Rule;
import racingcar.domain.Car;

import java.util.LinkedHashMap;
import java.util.Map;

public class RacingCarService {
    final private Map<Car, Integer> racingResult;

    public RacingCarService() {
        racingResult = new LinkedHashMap<>();
    }

    public void addCar(Car car) {
        racingResult.put(car, 0);
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
