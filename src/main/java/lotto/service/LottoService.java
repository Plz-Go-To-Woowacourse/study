package lotto.service;

import lotto.constants.lotto.BonusMatch;
import lotto.constants.lotto.Rank;
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

    public void updateLottoRank(int matchCount, BonusMatch bonusMatch) {
        WinningResult rank = WinningResult.findWinningResult(matchCount, bonusMatch);
        int value = 1;

        if (winningResult.containsKey(rank)) {
            value += winningResult.get(rank);
        }

        winningResult.put(rank, value);
    }

    public BonusMatch checkBonusMatch(int matchCount, boolean isBonusNumberMatched) {
        BonusMatch bonusMatch = Rank.checkBonusMatch(matchCount);

        if (bonusMatch == BonusMatch.NOT_RELEVANT) {
            return bonusMatch;
        }

        if (isBonusNumberMatched) {
            return BonusMatch.MATCH;
        }

        return BonusMatch.NO_MATCH;
    }

    public int calcMatchCount(Lotto lotto, Lotto winningLotto) {
        return lotto.calcMatchCount(winningLotto);
    }

    public boolean isBonusNumberMatched(Lotto lotto, BonusNumber bonusNumber) {
        return bonusNumber.isNumberInLotto(lotto);
    }
}
