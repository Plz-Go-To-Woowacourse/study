package lotto.controller;

import lotto.Exception.InvalidNumberException;
import lotto.Exception.InvalidPriceException;
import lotto.LottoService;
import lotto.domain.Lotto;
import lotto.domain.Receipt;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;

public class LottoMachine {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoMachine(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        LottoService lottoService = new LottoService(new ArrayList<Lotto>());
        Receipt receipt = purchaseLotto();
        outputView.printPurchaseCount(lottoService.calcPurchaseCount(receipt));
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
