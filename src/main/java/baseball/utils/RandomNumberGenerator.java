package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator{
    private static final Integer MAX_RANGE = 9;
    private static final Integer MIN_RANGE = 1;

    @Override
    public Integer generate() {
        return Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
    }
}
