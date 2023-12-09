package lotto;

import lotto.constants.LottoRule;
import lotto.domain.Lotto;
import lotto.domain.Receipt;
import lotto.utils.RandomNumberGenerator;

import java.util.List;

public class LottoService {
    private final List<Lotto> lottery;

    public LottoService(List<Lotto> lottery) {
        this.lottery = lottery;
    }

    public int calcPurchaseCount(Receipt receipt) {
        return receipt.calcPurchaseCount();
    }

    public void purchaseLotto() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        Lotto lotto = new Lotto(generator.createUniqueNumbers(
                LottoRule.START_LOTTO_NUMBER.getValue(),
                LottoRule.END_LOTTO_NUMBER.getValue(),
                LottoRule.LOTTO_NUMBER_COUNT.getValue())
        );

        lottery.add(lotto);
    }
}
