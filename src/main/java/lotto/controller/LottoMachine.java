package lotto.controller;

import lotto.Exception.InvalidNumberException;
import lotto.Exception.InvalidPriceException;
import lotto.domain.Receipt;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoMachine {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoMachine(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        Receipt receipt = purchaseLotto();
        outputView.printPurchaseCount(receipt.toString());
    }

    private Receipt purchaseLotto() {
        outputView.printPurchaseAmountInput();

        while (true) {
            try {
                int purchaseAmount = inputView.inputPurchaseAmount();
                return new Receipt(purchaseAmount);
            } catch (InvalidNumberException | InvalidPriceException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
