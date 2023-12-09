package lotto.controller;

import lotto.domain.PurchasedLotto;
import lotto.domain.WinningLotto;
import lotto.exception.InvalidInputException;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        PurchasedLotto purchasedLotto = buyLotto();
        WinningLotto winningLotto = getWinningLotto();
    }

    private WinningLotto getWinningLotto() {
        List<Integer> winningNumbers = getWinningNumber();
        Integer bonusNumber = getBonusNumber();

        return new WinningLotto(winningNumbers, bonusNumber);
    }

    private Integer getBonusNumber() {
        while (true) {
            try {
                outputView.printBonusNumberMessage();
                return inputView.inputBonusNumber();
            } catch (InvalidInputException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private List<Integer> getWinningNumber() {
        while (true) {
            try {
                outputView.printWinningLottoMessage();
                return inputView.inputWinningNumber();
            } catch (InvalidInputException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private PurchasedLotto buyLotto() {
        while (true) {
            try {
                outputView.printBuyLottoMessage();
                Integer price = inputView.buyLotto();

                PurchasedLotto purchasedLotto = new PurchasedLotto(price);
                outputView.printLottoList(purchasedLotto);

                return purchasedLotto;
            } catch (InvalidInputException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
