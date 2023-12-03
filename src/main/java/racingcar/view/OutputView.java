package racingcar.view;

import racingcar.constants.OutputMessage;

public class OutputView {
    public void printCarNameInput() {
        System.out.println(OutputMessage.CAR_NAME_INPUT.getText());
    }

    public void printAttemptInput() {
        System.out.println(OutputMessage.ATTEMP_REQUEST.getText());
    }
}
