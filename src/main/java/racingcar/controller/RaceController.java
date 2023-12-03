package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceController {
    private final OutputView outputView;
    private final InputView inputView;

    public RaceController(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }


    public void run() {
        RacingCar racingCar = startGame();
    }

    private RacingCar startGame() {
        outputView.printStartGame();
        return new RacingCar(inputView.inputCars());
    }
}
