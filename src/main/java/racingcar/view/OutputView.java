package racingcar.view;

import static racingcar.constants.ViewConstants.MOVEMENT_MESSAGE;
import static racingcar.constants.ViewConstants.START_MESSAGE;

public class OutputView {
    public void printStartGame() {
        System.out.println(START_MESSAGE);
    }

    public void printMovementMessage() {
        System.out.println(MOVEMENT_MESSAGE);
    }
}
