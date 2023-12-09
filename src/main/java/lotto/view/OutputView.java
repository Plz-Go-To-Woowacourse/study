package lotto.view;

import lotto.domain.Profit;
import lotto.domain.PurchasedLotto;
import lotto.domain.Reward;

import java.util.Map;

import static lotto.constants.ViewConstants.*;

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
        System.out.println(WINNING_NUMBER_MESSAGE);
    }

    public void printBonusNumberMessage() {
        System.out.println(BONUS_NUMBER_MESSAGE);
    }

    public void printResultMessage(Map<Reward, Long> resultCounts, Profit profit) {
        System.out.println(RESULT_ANALYSIS);
        System.out.println(SEPARATE);
        System.out.println(FIFTH_MESSAGE + resultCounts.getOrDefault(Reward.FIFTH, 0L) + COUNT_UNIT);
        System.out.println(FOURTH_MESSAGE + resultCounts.getOrDefault(Reward.FOURTH, 0L) + COUNT_UNIT);
        System.out.println(THIRD_MESSAGE + resultCounts.getOrDefault(Reward.THIRD, 0L) + COUNT_UNIT);
        System.out.println(SECOND_MESSAGE + resultCounts.getOrDefault(Reward.SECOND, 0L) + COUNT_UNIT);
        System.out.println(FIRST_MESSAGE + resultCounts.getOrDefault(Reward.FIRST, 0L) + COUNT_UNIT);
        System.out.println(profit.toString());
    }
}
