package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PurchasedLotto {
    List<Lotto> lottos;
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
        return this.lottos.stream()
                .map(Lotto::toString)
                .collect(Collectors.joining("\n"));
    }

    public void printLottos() {
        System.out.println(this.lottoCount + "개를 구매했습니다.");
        System.out.println(this.toString());
    }
}
