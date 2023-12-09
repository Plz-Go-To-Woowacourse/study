package lotto.controller;

import lotto.domain.PurchasedLotto;
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
        outputView.buyLottoMessage();
        Integer price = inputView.buyLotto();

        return new PurchasedLotto(price);
    }
}
