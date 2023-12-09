package lotto.controller;

import lotto.view.OutputView;

public class LottoMachine {
    private final OutputView outputView;

    public LottoMachine(OutputView outputView) {
        this.outputView = outputView;
    }

    public void start() {
        outputView.printPurchaseAmountInput();
    }
}
