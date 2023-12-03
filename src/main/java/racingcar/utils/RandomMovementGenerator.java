package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.constants.UtilsConstants.MAX_RANGE;
import static racingcar.constants.UtilsConstants.MIN_RANGE;

public class RandomMovementGenerator implements MovementGenerator{
    @Override
    public Integer generate() {
        return Randoms.pickNumberInRange(MIN_RANGE,MAX_RANGE);
    }
}
