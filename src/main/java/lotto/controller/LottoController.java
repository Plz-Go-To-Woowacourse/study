package lotto.controller;

import lotto.domain.LottoResult;
import lotto.domain.PurchasedLotto;
import lotto.domain.WinningLotto;
import lotto.exception.InvalidInputException;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

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
        List<LottoResult> lottoResult = lottoService.countMatchingNumbers(purchasedLotto, winningLotto);

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
