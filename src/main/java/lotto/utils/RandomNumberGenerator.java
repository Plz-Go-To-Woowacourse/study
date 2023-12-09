package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomNumberGenerator {
    public List<Integer> createUniqueNumbers(int startNumber, int endNumber, int count) {
        return Randoms.pickUniqueNumbersInRange(startNumber, endNumber, count);
    }
}
