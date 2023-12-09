package lotto.controller;

import lotto.Exception.InvalidLottoException;
import lotto.Exception.InvalidNumberException;
import lotto.Exception.InvalidPriceException;
import lotto.constants.lotto.BonusMatch;
import lotto.constants.lotto.Rule;
import lotto.service.LottoService;
import lotto.domain.BonusNumber;
import lotto.domain.Lotto;
import lotto.domain.Receipt;
import lotto.view.InputView;
import lotto.view.OutputView;

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
        BonusNumber bonusNumber = generateBonusNumber(winningLotto);

        outputView.printLottoStatistics();
    }

    private Receipt purchaseLotto() {
        outputView.printPurchaseAmountInput();

        while (true) {
            try {
                int purchaseAmount = inputView.inputNumber();
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
            outputView.printLotto(lottoService.findLotto(index).toString());
        }
    }

    private Lotto generateWinningLotto() {
        while (true){
            try {
                return new Lotto(inputView.inputNumbers());
            } catch (InvalidNumberException | InvalidLottoException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }

    private BonusNumber generateBonusNumber(Lotto winningLotto) {
        while (true) {
            try {
                return new BonusNumber(inputView.inputNumber(), winningLotto);
            } catch (InvalidNumberException | InvalidLottoException exception) {
                outputView.printErrorMessage(exception.getMessage());
            }
        }
    }

    private void findRank(Lotto winningLotto, BonusNumber bonusNumber) {
        for (int index = 0; index < Rule.LOTTO_NUMBER_COUNT.getValue(); index++) {
            Lotto lotto = lottoService.findLotto(index);

            int matchCount = lottoService.calcMatchCount(lotto, winningLotto);
            boolean isBonusNumberMatched = lottoService.isBonusNumberMatched(lotto, bonusNumber);

        }
    }
}
