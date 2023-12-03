package racingcar.controller;

import racingcar.Service.RaceService;
import racingcar.domain.Movement;
import racingcar.domain.RacingCar;
import racingcar.domain.Result;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
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
        RacingCar racingCar = getRacingCar();
        Movement movement = getMovement();

        outputView.printResultMessage();
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < movement.size(); i++) {
            Result result = raceService.move(racingCar, movement);
            results.add(result);
            outputView.printResult(result);
            outputView.printBlank();
        }

        outputView.printWinners(raceService.findWinners(results));
    }

    private Movement getMovement() {
        outputView.printInputMovementMessage();
        Integer movement = inputView.inputMovement();

        return new Movement(movement);
    }

    private RacingCar getRacingCar() {
        outputView.printStartGame();
        List<String> carNames = inputView.inputCars();

        return new RacingCar(carNames);
    }
}
