package racingcar.controller;

import racingcar.Service.RaceService;
import racingcar.domain.RacingCar;
import racingcar.domain.Result;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RaceController {
    private final OutputView outputView;
    private final InputView inputView;
    private final RaceService raceService;

    public RaceController(OutputView outputView, InputView inputView, RaceService raceService) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.raceService = raceService;
    }


    public void run() {
        RacingCar racingCar = startGame();
        Result result = raceService.moveCars(racingCar);
    }

    private RacingCar startGame() {
        outputView.printStartGame();
        List<String> carNames = inputView.inputCars();

        outputView.printMovementMessage();
        Integer movement = inputView.inputMovement();

        return new RacingCar(carNames, movement);
    }
}
