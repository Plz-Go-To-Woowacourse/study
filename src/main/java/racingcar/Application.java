package racingcar;

import racingcar.controller.RaceController;
import racingcar.utils.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RaceController raceController = new RaceController(
                new OutputView(),
                new InputView(new Validator())
        );
        raceController.run();
    }
}
