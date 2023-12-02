package baseball.controller;

import baseball.domain.ComputerNumber;
import baseball.domain.MyNumber;
import baseball.domain.Result;
import baseball.service.BaseBallService;
import baseball.view.InputView;
import baseball.view.OutPutView;

public class BaseBallController {
    private final InputView inputView;
    private final OutPutView outPutView;
    private final BaseBallService baseBallService;

    public BaseBallController(InputView inputView, OutPutView outPutView, BaseBallService baseBallService) {
        this.inputView = inputView;
        this.outPutView = outPutView;
        this.baseBallService = baseBallService;
    }

    public void run() {
        ComputerNumber computerNumber = startGame();
        Result result = null;

        while (result == null || !result.isGameOver()) {
            MyNumber myNumber = getMyNumber();

            result = baseBallService.compareNumbers(myNumber, computerNumber);

            outPutView.displayResultMessage(result);
        }
    }

    private ComputerNumber startGame() {
        outPutView.startBaseBallMessage();
        return getComputerNumber();
    }

    private ComputerNumber getComputerNumber() {
        return new ComputerNumber();
    }

    private MyNumber getMyNumber() {
        outPutView.inputNumberMessage();
        String inputNumber = inputView.inputNumber();

        return new MyNumber(inputNumber);
    }
}
