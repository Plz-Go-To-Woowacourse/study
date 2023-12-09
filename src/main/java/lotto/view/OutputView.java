package lotto.view;

import lotto.constants.OutputMessage;
import lotto.constants.Seperator;

public class OutputView {
    public void printPurchaseAmountInput() {
        System.out.println(OutputMessage.PURCHASE_AMOUNT_INPUT.getText());
    }

    public void printWinningNumberInput() {
        System.out.println();
        System.out.println(OutputMessage.WINNING_NUMBER_INPUT.getText());
    }

    public void printBonusNumberInput() {
        System.out.println();
        System.out.println(OutputMessage.BONUS_NUMBER_INPUT.getText());
    }

    public void printPurchaseCount(int purchaseCount) {
        System.out.println();
        System.out.printf((OutputMessage.LOTTO_PURCHASE_COUNT.getText()) + "%n", purchaseCount);
    }

    public void printLotto(String lotto) {
        System.out.printf((OutputMessage.LOTTO_NUMBERS.getText()) + "%n", lotto);
    }

    public void printLottoStatistics() {
        System.out.println();
        System.out.println(OutputMessage.WINNING_STATISTICS.getText());
        System.out.println(Seperator.LOTTO_STATISTICS.getValue());
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}
