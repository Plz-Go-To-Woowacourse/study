package baseball.controller;

import baseball.domain.BaseballNumbers;
import baseball.domain.Judgment;
import baseball.exception.DuplicateNumberException;
import baseball.exception.InvalidNumberException;
import baseball.exception.InvalidNumberSizeException;
import baseball.utils.RandomNumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBall {
    private final OutputView outputView;
    private final InputView inputView;

    public BaseBall(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void play() {
        startBaseBall();
    }

    private void startBaseBall() {
        outputView.printGameStart();
        BaseballNumbers computerNumbers = createComputerNumbers();

        while (true) {
            Judgment judgment = judgeBaseballNumbers(computerNumbers);
            judgment.showJudgment(outputView);

            if (judgment.isUserWin()) {
                outputView.printGameEnd();
                break;
            }
        }
    }

    private BaseballNumbers createComputerNumbers() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        return new BaseballNumbers(randomNumberGenerator.createRandomNumbers());
    }

    private BaseballNumbers inputBaseballNumber() {
        while (true) {
            try {
                outputView.printNumberInput();
                return new BaseballNumbers(inputView.inputNumbers());
            } catch (InvalidNumberException | InvalidNumberSizeException | DuplicateNumberException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }

    private Judgment judgeBaseballNumbers(BaseballNumbers computerNumbers) {
        BaseballNumbers userNumbers = inputBaseballNumber();

        int ball = userNumbers.countBall(computerNumbers);
        int strike = userNumbers.countStrike(computerNumbers);

        return new Judgment(ball, strike);
    }
}
