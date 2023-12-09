package lotto.controller;

import lotto.Exception.InvalidLottoException;
import lotto.Exception.InvalidNumberException;
import lotto.Exception.InvalidPriceException;
import lotto.LottoService;
import lotto.domain.BonusNumber;
import lotto.domain.Lotto;
import lotto.domain.Receipt;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    private final InputView inputView;
    private final OutputView outputView;
    private final LottoService lottoService;

    public LottoMachine(InputView inputView, OutputView outputView, LottoService lottoService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.lottoService = lottoService;
    }

    public void start() {
        Receipt receipt = purchaseLotto();
        int lottoCount = lottoService.calcPurchaseCount(receipt);

        outputView.printPurchaseCount(lottoCount);

        generateLottery(lottoCount);
        showLottery(lottoCount);

        outputView.printWinningNumberInput();
        Lotto winningLotto = generateWinningLotto();

        outputView.printBonusNumberInput();
        BonusNumber bonusNumber =
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

    private void generateLottery(int lottoCount) {
        for (int count = 0; count < lottoCount; count++){
            lottoService.purchaseLotto();
        }
    }

    private void showLottery(int lottoCount) {
        for (int index = 0; index < lottoCount; index++){
            outputView.printLotto(lottoService.findLotto(index));
        }
    }

    private Lotto generateWinningLotto() {
        while (true){
            try {
                return new Lotto(inputView.inputWinningNumbers());
            } catch (InvalidNumberException | InvalidLottoException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
