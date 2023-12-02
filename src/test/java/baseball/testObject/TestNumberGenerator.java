package baseball.testObject;

import baseball.utils.NumberGenerator;

public class TestNumberGenerator implements NumberGenerator {
    private final int[] numbers;
    private Integer index = 0;

    public TestNumberGenerator(int... numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer generate() {
        return numbers[index++];
    }
}
