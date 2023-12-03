package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.model.RacingResult;
import racingcar.service.RacingCarService;
import racingcar.utils.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCar {
    private final OutputView outputView;
    private final InputView inputView;
    private final RacingCarService racingCarService;

    public RacingCar(OutputView outputView, InputView inputView, RacingCarService racingCarService) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.racingCarService = racingCarService;
    }

    public void start() {
        Cars cars = registerCars();
        int attempt = inputAttempt();

        for (int count = 0; count < attempt; count++) {
            race(cars);
        }

        showWinners();
    }

    private Cars registerCars() {
        outputView.printCarNameInput();
        Cars cars = new Cars(inputView.inputCarNames());
        cars.registerCar(racingCarService);

        return cars;
    }

    private int inputAttempt() {
        outputView.printAttemptInput();
        int attempt = inputView.inputAttemptCount();
        outputView.printLineSeparator();

        return attempt;
    }

    private void race(Cars cars) {
        List<RacingResult> result = cars.race(racingCarService, new RandomNumberGenerator());
        outputView.printRacingResult(result);
    }

    private void showWinners() {
        outputView.printWinners(racingCarService.findWinners());
    }
}
