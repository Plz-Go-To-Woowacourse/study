package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

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
        List<String> carNames = inputView.inputCars();
        Integer movement = inputView.inputMovement();

        return new RacingCar(carNames, movement);
    }
}
