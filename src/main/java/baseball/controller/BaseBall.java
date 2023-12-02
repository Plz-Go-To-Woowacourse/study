package baseball.controller;

import baseball.domain.BaseballNumbers;
import baseball.exception.InvalidNumberException;
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
                return new BaseballNumbers(inputView.inputNumbers());
            } catch (InvalidNumberException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }

    public void play() {
        outputView.printGameStart();
        outputView.printNumberInput();

        BaseballNumbers baseballNumber = inputBaseballNumber();
    }
}
