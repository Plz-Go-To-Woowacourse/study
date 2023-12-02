package baseball.controller;

import baseball.domain.BaseballNumbers;
import baseball.exception.DuplicateNumberException;
import baseball.exception.InvalidNumberException;
import baseball.exception.InvalidNumberSizeException;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class BaseBall {
    private final OutputView outputView;
    private final InputView inputView;

    public BaseBall(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    private BaseballNumbers inputBaseballNumber() {
        while (true){
            try {
                outputView.printNumberInput();
                return new BaseballNumbers(inputView.inputNumbers());
            } catch (InvalidNumberException | InvalidNumberSizeException | DuplicateNumberException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }

    public void play() {
        outputView.printGameStart();

        BaseballNumbers baseballNumber = inputBaseballNumber();
    }
}
