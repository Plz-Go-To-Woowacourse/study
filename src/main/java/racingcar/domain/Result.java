package racingcar.domain;

import java.util.List;
import java.util.Map;

public class Result {
    private final Map<String, Integer> results;

    public Result(RacingCar racingCar, List<Integer> moveResult) {
        this.results = racingCar.getNameToMoveCountMap(moveResult);
    }

    @Override
    public String toString() {
        return "Result{" +
                "results=" + results +
                '}';
    }
}
