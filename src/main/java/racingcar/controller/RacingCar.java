package racingcar.controller;

import racingcar.view.OutputView;

public class RacingCar {
    private final OutputView outputView;

    public RacingCar(OutputView outputView) {
        this.outputView = outputView;
    }

    public void start() {
        outputView.printCarNameInput();
    }
}
