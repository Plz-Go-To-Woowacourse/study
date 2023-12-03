package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCar {
    private final OutputView outputView;
    private final InputView inputView;

    public RacingCar(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void start() {
        outputView.printCarNameInput();
        Cars cars = new Cars(inputView.inputCarNames());
    }
}
