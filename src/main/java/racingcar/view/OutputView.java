package racingcar.view;

import racingcar.constants.Mark;
import racingcar.constants.OutputMessage;
import racingcar.model.RacingResult;

import java.util.List;

public class OutputView {
    public void printCarNameInput() {
        System.out.println(OutputMessage.CAR_NAME_INPUT.getText());
    }

    public void printAttemptInput() {
        System.out.println(OutputMessage.ATTEMP_REQUEST.getText());
    }

    public void printRacingResult(List<RacingResult> racingResults) {
        for (RacingResult racingResult: racingResults) {
            System.out.println(racingResult.toString());
        }
        printLineSeparator();
    }

    public void printWinners(List<String> winners) {
        System.out.printf(OutputMessage.WINNER.getText(), String.join(Mark.WINNER_SEPARATOR.getText(), winners));
    }

    public void printLineSeparator() {
        System.out.println();
    }
}
