package lotto.view;

import lotto.domain.PurchasedLotto;

import static lotto.constants.ViewConstants.BUY_LOTTO_MESSAGE;

public class OutputView {

    public void printBuyLottoMessage() {
        System.out.println(BUY_LOTTO_MESSAGE);
    }

    public void printLottoList(PurchasedLotto purchasedLotto) {
        purchasedLotto.printLottos();
    }

    public void printErrorMessage(String message) {
        System.out.println(message);
    }

    public void printWinningLottoMessage() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }
}
