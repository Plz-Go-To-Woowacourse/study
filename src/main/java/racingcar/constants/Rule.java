package racingcar.constants;

public enum Rule {
    NAME_MAX_LENGTH(5),
    MOVE_NUMBER_START(0),
    MOVE_NUMBER_END(9),
    MOVE_STANDARD_NUMBER(4);

    private final int value;

    Rule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
