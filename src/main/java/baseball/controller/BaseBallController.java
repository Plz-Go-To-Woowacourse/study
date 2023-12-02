package baseball.controller;

import baseball.domain.ComputerNumber;
import baseball.domain.MyNumber;
import baseball.domain.Result;
import baseball.service.BaseBallService;
import baseball.utils.NumberGenerator;
import baseball.view.InputView;
import baseball.view.OutPutView;

public class BaseBallController {
    private final InputView inputView;
    private final OutPutView outPutView;
    private final BaseBallService baseBallService;
    private final NumberGenerator numberGenerator;

    public BaseBallController(InputView inputView, OutPutView outPutView, BaseBallService baseBallService, NumberGenerator numberGenerator) {
        this.inputView = inputView;
        this.outPutView = outPutView;
        this.baseBallService = baseBallService;
        this.numberGenerator = numberGenerator;
    }

    public void run() {
        outPutView.startBaseBallMessage();
        while (true) {
            ComputerNumber computerNumber = startGame();
            Result result = null;

            while (result == null || !result.isGameOver()) {
                MyNumber myNumber = getMyNumber();
                result = baseBallService.compareNumbers(myNumber, computerNumber);
                outPutView.displayResultMessage(result);
            }

            if (!askRestart()) {
                break;
            }
        }
    }

    private Boolean askRestart() {
        outPutView.restartMessage();
        Integer restart = inputView.inputRestart();

        return baseBallService.isValid(restart);
    }

    private ComputerNumber startGame() {
        return getComputerNumber();
    }

    private ComputerNumber getComputerNumber() {
        return new ComputerNumber(numberGenerator);
    }

    private MyNumber getMyNumber() {
        outPutView.inputNumberMessage();
        String inputNumber = inputView.inputNumber();

        return new MyNumber(inputNumber);
    }
}
