package lotto.service;

import lotto.domain.LottoResult;
import lotto.domain.PurchasedLotto;
import lotto.domain.WinningLotto;

import java.util.List;

public class LottoService {
    public List<LottoResult> countMatchingNumbers(PurchasedLotto purchasedLotto, WinningLotto winningLotto) {
        return purchasedLotto.toLottoResultList(winningLotto);
    }
}
