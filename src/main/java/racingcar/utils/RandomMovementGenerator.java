package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMovementGenerator implements MovementGenerator{
    @Override
    public Integer generate() {
        return Randoms.pickNumberInRange(0,9);
    }
}
