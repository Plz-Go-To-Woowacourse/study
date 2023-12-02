package baseball.view;

import baseball.domain.Result;

import static baseball.constants.ViewConstants.*;

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

    public void restartMessage() {
        System.out.println(GAME_OVER_MESSAGE);
        System.out.println(RESTART_MESSAGE);
    }
}
