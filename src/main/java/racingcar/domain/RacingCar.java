package racingcar.domain;

import java.util.List;

public class RacingCar {
    private final List<String> CarNames;
    private final Integer movement;

    public RacingCar(List<String> carNames, Integer movement) {
        this.CarNames = carNames;
        this.movement = movement;
    }
}
