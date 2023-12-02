package baseball.domain;

import baseball.constants.Rule;
import baseball.view.OutputView;

public class Judgment {
    private final int ball;
    private final int strike;

    public Judgment(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public boolean isUserWin() {
        return ball == 0 && strike == Rule.NUMBER_COUNT.getValue();
    }

    public void showJudgment(OutputView outputView) {
        if (ball == 0 && strike == 0) {
            outputView.printNotMatch();
        }
        if (ball > 0) {
            outputView.printBallCount(ball);
        }
        if (strike > 0) {
            outputView.printStrikeCount(strike);
        }

        outputView.printBlankLine();
    }
}
