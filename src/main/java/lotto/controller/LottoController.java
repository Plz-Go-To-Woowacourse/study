package lotto.controller;

import lotto.domain.*;
import lotto.exception.InvalidInputException;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;
import java.util.Map;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;
    private final LottoService lottoService;

    public LottoController(InputView inputView, OutputView outputView, LottoService lottoService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.lottoService = lottoService;
    }

    public void run() {
        PurchasedLotto purchasedLotto = buyLotto();
        WinningLotto winningLotto = getWinningLotto();
        List<LottoResult> lottoResults = lottoService.countMatchingNumbers(purchasedLotto, winningLotto);
        Map<Reward, Long> resultCounts = lottoService.countResult(lottoResults);
        Profit profit = lottoService.countProfit(purchasedLotto, resultCounts);

        outputView.printResultMessage(resultCounts, profit);
    }

    private WinningLotto getWinningLotto() {
        List<Integer> winningNumbers = getWinningNumber();
        String bonusNumber = getBonusNumber();

        return new WinningLotto(winningNumbers, bonusNumber);
    }

    private String getBonusNumber() {
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
