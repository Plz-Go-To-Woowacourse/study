package baseball.utils;

import java.util.ArrayList;
import java.util.List;

import baseball.constants.Rule;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    public List<Integer> createRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < Rule.NUMBER_COUNT.getValue()) {
            int randomNumber = Randoms.pickNumberInRange(
                    Rule.RANDOM_NUMBER_START.getValue(),
                    Rule.RANDOM_NUMBER_END.getValue());

            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        return numbers;
    }
}
