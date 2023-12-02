package baseball.constants;

public enum Rule {
    NUMBER_COUNT(3);

    private int value;

    Rule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
