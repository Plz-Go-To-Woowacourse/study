package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.service.RacingCarService;
import racingcar.utils.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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
        outputView.printCarNameInput();
        Cars cars = new Cars(inputView.inputCarNames());
        cars.registerCar(racingCarService);

        outputView.printAttemptInput();
        int attempt = inputView.inputAttemptCount();

        race(cars);
    }

    public void race(Cars cars) {
        cars.race(racingCarService, new RandomNumberGenerator());
    }
}
