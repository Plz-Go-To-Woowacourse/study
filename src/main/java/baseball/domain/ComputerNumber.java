package baseball.domain;

import baseball.utils.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

import static baseball.constants.DomainConstants.MAX_SIZE;

public class ComputerNumber {
    private final List<Integer> computerNumber;
    private final NumberGenerator numberGenerator;

    public ComputerNumber(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.computerNumber = createRandomNumbers();
    }

    private List<Integer> createRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < MAX_SIZE) {
            int randomNumber = numberGenerator.generate();
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
