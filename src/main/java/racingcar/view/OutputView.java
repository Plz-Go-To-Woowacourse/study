package racingcar.view;

import racingcar.domain.Result;

import java.util.List;

import static racingcar.constants.ViewConstants.*;

public class OutputView {
    public void printStartGame() {
        System.out.println(START_MESSAGE);
    }

    public void printInputMovementMessage() {
        System.out.println(MOVEMENT_MESSAGE);
    }

    public void printResult(Result result) {
        System.out.println(result.toString());
    }

    public void printResultMessage() {
        System.out.println(RESULT_MESSAGE);
    }

    public void printBlank() {
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
