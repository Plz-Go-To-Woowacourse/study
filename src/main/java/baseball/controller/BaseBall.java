package baseball.controller;

import baseball.exception.InvalidNumberException;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBall {
    private final OutputView outputView;
    private final InputView inputView;

    public BaseBall(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    private int[] inputBaseBallNumber() {
        while (true){
            try {
                return inputView.inputNumber();
            } catch (InvalidNumberException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }

    public void play() {
        outputView.printGameStart();
        outputView.printNumberInput();

        int[] baseBallNumber = inputBaseBallNumber();
    }
}
