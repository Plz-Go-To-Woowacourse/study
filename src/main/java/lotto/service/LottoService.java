package lotto.service;

import lotto.domain.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LottoService {
    public List<LottoResult> countMatchingNumbers(PurchasedLotto purchasedLotto, WinningLotto winningLotto) {
        return purchasedLotto.toLottoResultList(winningLotto);
    }

    public Map<Reward, Long> countResult(List<LottoResult> lottoResults) {
        return lottoResults.stream()
                .collect(Collectors.groupingBy(LottoResult::getReward, Collectors.counting()));
    }

    public Profit countProfit(PurchasedLotto purchasedLotto, Map<Reward, Long> resultCounts) {
        Integer lottoPrice = purchasedLotto.countPrice();
        Long total = resultCounts.entrySet().stream()
                .mapToLong(entry -> entry.getKey().getReward() * entry.getValue())
                .sum();

        double profitRate = (double) total / lottoPrice;
        double roundedProfitRate = Math.round(profitRate * 100) / 100.0;

        return new Profit(roundedProfitRate);
    }
}
