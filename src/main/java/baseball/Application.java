package baseball;

import baseball.constants.OutputMessage;
import baseball.controller.BaseBall;
import baseball.utils.Validator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        BaseBall baseBall = new BaseBall(
                new OutputView(),
                new InputView(new Validator()));

        baseBall.play();
    }
}
