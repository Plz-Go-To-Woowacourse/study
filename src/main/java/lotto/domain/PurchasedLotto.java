package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PurchasedLotto {
    private final List<Lotto> lottos;
    private final Integer lottoCount;

    public PurchasedLotto(Integer price) {
        this.lottos = new ArrayList<>();
        this.lottoCount = price / 1000;

        IntStream.range(0, lottoCount)
                .mapToObj(i -> generateLottoNumbers(1, 45, 6))
                .map(Lotto::new)
                .forEach(lottos::add);
    }

    private List<Integer> generateLottoNumbers(Integer startNumber, Integer endNumber, Integer size) {
        return Randoms.pickUniqueNumbersInRange(startNumber, endNumber, size);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Lotto lotto : lottos) {
            builder.append(lotto.toString()).append("\n");
        }

        return builder.toString();
    }

    public void printLottos() {
        System.out.println(this.lottoCount + "개를 구매했습니다.");
        System.out.println(this.toString());
    }

    public List<LottoResult> toLottoResultList(WinningLotto winningLotto) {
        return this.lottos.stream()
                .map(lotto -> new LottoResult(winningLotto.countCorrectNumber(lotto), winningLotto.isCorrectBonusNumber(lotto)))
                .collect(Collectors.toList());
    }

    public Integer countPrice() {
        return lottoCount * 1000;
    }
}
