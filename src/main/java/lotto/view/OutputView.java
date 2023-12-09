package lotto.view;

import lotto.constants.OutputMessage;

public class OutputView {
    public void printPurchaseAmountInput() {
        System.out.println(OutputMessage.PURCHASE_AMOUNT_INPUT.getText());
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    public void printPurchaseCount(int purchaseCount) {
        System.out.println();
        System.out.printf((OutputMessage.LOTTO_PURCHASE_COUNT.getText()) + "%n", purchaseCount);
        System.out.println();
    }
}
