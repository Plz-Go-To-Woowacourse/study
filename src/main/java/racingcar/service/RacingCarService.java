package racingcar.service;

import racingcar.constants.Mark;
import racingcar.constants.Rule;
import racingcar.domain.Car;
import racingcar.model.RacingResult;

import java.util.*;

public class RacingCarService {
    final private Map<Car, Integer> racingResult;

    public RacingCarService() {
        racingResult = new LinkedHashMap<>();
    }

    public void addCar(Car car) {
        racingResult.put(car, 0);
    }

    private void forwardCar(Car car) {
        int move = racingResult.get(car) + Rule.MOVE_FORWARD_COUNT.getValue();
        racingResult.put(car, move);
    }

    public void moveCar(Car car, int randomNumber) {
        if (randomNumber >= Rule.MOVE_STANDARD_NUMBER.getValue()) {
            forwardCar(car);
        }
    }

    public RacingResult findCarRacingResult(Car car) {
        return new RacingResult(car.toString(), markForwardCount(car));
    }

    private String markForwardCount(Car car) {
        int forwardCount = racingResult.get(car);
        StringBuilder mark = new StringBuilder();

        for (int count = 0; count < forwardCount; count++) {
            mark.append(Mark.CAR_FORWARD.getText());
        }

        return mark.toString();
    }

    public List<String> findWinners() {
        int maxForwardCount = findMaxForwardCount();
        List<String> winners = new ArrayList<>();

        for (Car car: racingResult.keySet()) {
            if (racingResult.get(car) == maxForwardCount) {
                winners.add(car.toString());
            }
        }

        return winners;
    }

    private int findMaxForwardCount() {
        return Collections.max(racingResult.values());
    }
}
