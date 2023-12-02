package baseball.constants;

public enum Rule {
    NUMBER_COUNT(3),
    RANDOM_NUMBER_START(1),
    RANDOM_NUMBER_END(9);

    private int value;

    Rule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
