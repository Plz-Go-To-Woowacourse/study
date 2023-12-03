package racingcar;

import racingcar.controller.RacingCar;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar(new OutputView(), new InputView());
        racingCar.start();
    }
}
