package lotto.controller;

import lotto.domain.PurchasedLotto;
import lotto.exception.InvalidPriceInputException;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        PurchasedLotto purchasedLotto = buyLotto();
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
