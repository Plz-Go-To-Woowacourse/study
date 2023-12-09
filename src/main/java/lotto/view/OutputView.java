package lotto.view;

import lotto.domain.Profit;
import lotto.domain.PurchasedLotto;
import lotto.domain.Reward;

import java.util.Map;

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

    public void printBonusNumberMessage() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public void printResultMessage(Map<Reward, Long> resultCounts, Profit profit) {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + resultCounts.getOrDefault(Reward.FIFTH, 0L) + "개");
        System.out.println("4개 일치 (50,000원) - " + resultCounts.getOrDefault(Reward.FOURTH, 0L) + "개");
        System.out.println("5개 일치 (1,500,000원) - " + resultCounts.getOrDefault(Reward.THIRD, 0L) + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + resultCounts.getOrDefault(Reward.SECOND, 0L) + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + resultCounts.getOrDefault(Reward.FIRST, 0L) + "개");
        System.out.println(profit.toString());
    }
}
