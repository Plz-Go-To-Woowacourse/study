package lotto.controller;

import lotto.domain.PurchasedLotto;
import lotto.domain.WinningLotto;
import lotto.exception.InvalidPriceInputException;
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
        WinningLotto winningLotto = inputWinningNumber();
    }

    private WinningLotto inputWinningNumber() {
        while (true) {
            try {
                outputView.printWinningLottoMessage();
                List<Integer> winningNumbers = inputView.inputWinningNumber();

                return new WinningLotto(winningNumbers);
            } catch (InvalidPriceInputException e) {
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
            } catch (InvalidPriceInputException e) {
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
