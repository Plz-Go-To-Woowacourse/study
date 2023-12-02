package baseball.view;

import baseball.constants.OutputMessage;

public class OutputView {
    public void printGameStart() {
        System.out.println(OutputMessage.START.getText());
    }

    public void printNumberInput() {
        System.out.print(OutputMessage.NUMBER_INPUT.getText());
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}
