package lotto.service;

import lotto.constants.lotto.WinningResult;
import lotto.constants.lotto.Rule;
import lotto.domain.BonusNumber;
import lotto.domain.Lotto;
import lotto.domain.Receipt;
import lotto.utils.RandomNumberGenerator;

import java.util.List;
import java.util.Map;

public class LottoService {
    private final List<Lotto> lottery;
    private final Map<WinningResult, Integer> winningResult;

    public LottoService(List<Lotto> lottery, Map<WinningResult, Integer> winningResult) {
        this.lottery = lottery;
        this.winningResult = winningResult;
    }

    public int calcPurchaseCount(Receipt receipt) {
        return receipt.calcPurchaseCount();
    }

    public void purchaseLotto() {
        RandomNumberGenerator generator = new RandomNumberGenerator();

        Lotto lotto = new Lotto(generator.createUniqueNumbers(
                Rule.START_LOTTO_NUMBER.getValue(),
                Rule.END_LOTTO_NUMBER.getValue(),
                Rule.LOTTO_NUMBER_COUNT.getValue())
        );

        lottery.add(lotto);
    }

    public Lotto findLotto(int index) {
        return lottery.get(index);
    }

//    public void findLottoRank(Lotto lotto, Lotto winningLotto) {
//        int matchCount = calcMatchCount(lotto, winningLotto);
//        BonusMatch bonusMatch = BonusMatch.NOT_RELEVANT;
//
//        if (matchCount == 5) {
//            bonusMatch = checkBonusMatch(lotto, );
//        }
//    }
//
////    public BonusMatch checkBonusMatch(int matchCount, boolean isBonusNumberMatched, Lotto lotto) {
////        if (matchCount == 5 && ) {
////
////        }
////    }

    public int calcMatchCount(Lotto lotto, Lotto winningLotto) {
        return lotto.calcMatchCount(winningLotto);
    }

    public boolean isBonusNumberMatched(Lotto lotto, BonusNumber bonusNumber) {
        return bonusNumber.isNumberInLotto(lotto);
    }
}
