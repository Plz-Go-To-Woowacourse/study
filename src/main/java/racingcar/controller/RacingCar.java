package racingcar.controller;

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
        outputView.printCarNameInput();
        Cars cars = new Cars(inputView.inputCarNames());
        cars.registerCar(racingCarService);

        outputView.printAttemptInput();
        int attempt = inputView.inputAttemptCount();

        race(cars);
    }

    public void race(Cars cars) {
        List<RacingResult> result = cars.race(racingCarService, new RandomNumberGenerator());

    }
}
