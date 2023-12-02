package baseball;

import baseball.controller.BaseBallController;
import baseball.service.BaseBallService;
import baseball.utils.RandomNumberGenerator;
import baseball.view.InputView;
import baseball.view.OutPutView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseBallController baseBallController = new BaseBallController(
                new InputView(),
                new OutPutView(),
                new BaseBallService(),
                new RandomNumberGenerator()
        );
        baseBallController.run();
    }
}
