package racingcar.view;

import racingcar.constants.OutputMessage;
import racingcar.model.RacingResult;

import java.util.List;

public class OutputView {
    public void printCarNameInput() {
        System.out.println(OutputMessage.CAR_NAME_INPUT.getText());
    }

    public void printAttemptInput() {
        System.out.println(OutputMessage.ATTEMP_REQUEST.getText());
        printLineSeperator();
    }

    public void printRacingResult(List<RacingResult> racingResults) {
        for (RacingResult racingResult: racingResults) {
            System.out.println(racingResult.toString());
        }
        printLineSeperator();
    }

    private void printLineSeperator() {
        System.out.println();
    }
}
