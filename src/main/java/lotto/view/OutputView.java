package lotto.view;

import lotto.constants.lotto.WinningResult;
import lotto.constants.message.OutputMessage;
import lotto.constants.expression.Seperator;

import java.util.Map;

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

    public void printWinningResult(Map<WinningResult, Integer> winningResult) {
        for (WinningResult result: winningResult.keySet()) {
            String standard = result.getStandard();
            String prize = String.format("(%,d원)", result.getPrize());
            int count = winningResult.get(result);

            System.out.println(standard + " " + prize + " - " + count + "개");
        }
    }
}
