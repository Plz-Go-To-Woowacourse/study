package racingcar;

import racingcar.controller.RacingCar;
import racingcar.utils.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar(
                new OutputView(),
                new InputView(new Validator()));
        racingCar.start();
    }
}
