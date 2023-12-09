package lotto.view;

import lotto.constants.OutputMessage;

public class OutputView {
    public void printPurchaseAmountInput() {
        System.out.println(OutputMessage.PURCHASE_AMOUNT_INPUT);
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}
