package baseball.controller;

import baseball.domain.BaseballNumbers;
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
        outputView.printGameStart();

        BaseballNumbers computerNumbers = createComputerNumbers();
        judgeBaseballNumbers(computerNumbers);
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

    private void judgeBaseballNumbers(BaseballNumbers computerNumbers) {
        BaseballNumbers userNumbers = inputBaseballNumber();

        int ball = userNumbers.countBall(computerNumbers);
        int strike = userNumbers.countStrike(computerNumbers);

        showJudgment(ball, strike);
    }

    private void showJudgment(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            outputView.printNotMatch();
            return;
        }

        if (ball > 0) {
            outputView.printBallCount(ball);
        }
        if (strike > 0) {
            outputView.printStrikeCount(strike);
        }
    }
}
