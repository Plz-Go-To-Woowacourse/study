package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PurchasedLotto {
    List<Lotto> lottos;

    public PurchasedLotto(Integer price) {
        this.lottos = new ArrayList<>();
        int lottoCount = price / 1000;

        IntStream.range(0, lottoCount)
                .mapToObj(i -> generateLottoNumbers(1, 45, 6))
                .map(Lotto::new)
                .forEach(lottos::add);
    }

    private List<Integer> generateLottoNumbers(Integer startNumber, Integer endNumber, Integer size) {
        return Randoms.pickUniqueNumbersInRange(startNumber, endNumber, size);
    }
}
