package baseball.view;

import baseball.constants.OutputMessage;

public class OutputView {
    public void printGameStart() {
        System.out.println(OutputMessage.START.getText());
    }

    public void printGameEnd() {
        System.out.println(OutputMessage.END.getText());
    }

    public void printRetry() {
        System.out.println(OutputMessage.RETRY.getText());
    }

    public void printNumberInput() {
        System.out.print(OutputMessage.NUMBER_INPUT.getText());
    }

    public void printBallCount(int ball) {
        System.out.printf(OutputMessage.BALL.getText() + " ", ball);
    }

    public void printStrikeCount(int strike) {
        System.out.printf(OutputMessage.STRIKE.getText(), strike);
    }

    public void printNotMatch() {
        System.out.print(OutputMessage.NOT_MATCH.getText());
    }

    public void printBlankLine() {
        System.out.println();
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}
