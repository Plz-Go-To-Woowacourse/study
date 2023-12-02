package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private final List<Integer> computerNumber;

    public ComputerNumber() {
        this.computerNumber = createRandomNumbers();
    }

    private List<Integer> createRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }

    public Integer getNumberIndex(Integer index) {
        return computerNumber.get(index);
    }

    public Boolean contains(Integer numberIndex) {
        return computerNumber.contains(numberIndex);
    }
}
