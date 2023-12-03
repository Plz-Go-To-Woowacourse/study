package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constants.Rule;

public class RandomNumberGenerator {
    public int createRandomNumber() {
        return Randoms.pickNumberInRange(Rule.MOVE_NUMBER_START.getValue(), Rule.MOVE_NUMBER_END.getValue());
    }
}
