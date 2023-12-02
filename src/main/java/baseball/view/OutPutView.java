package baseball.view;

import baseball.domain.Result;

import static baseball.constants.ViewConstants.INPUT_NUMBER;
import static baseball.constants.ViewConstants.START_BASEBALL;

public class OutPutView {
    public void startBaseBallMessage() {
        System.out.println(START_BASEBALL);
    }

    public void inputNumberMessage() {
        System.out.print(INPUT_NUMBER);
    }

    public void displayResultMessage(Result result) {
        System.out.println(result.toString());
    }
}
