package racingcar.model;

import racingcar.constants.OutputMessage;

public class RacingResult {
    private final String carName;
    private final String mark;

    public RacingResult(String carName, String mark) {
        this.carName = carName;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format(OutputMessage.CAR_NAME_AND_RACING_RESULT.getText(), carName, mark);
    }
}
