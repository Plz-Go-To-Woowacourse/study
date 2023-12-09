package lotto.constants.lotto;

public enum Rule {
    START_LOTTO_NUMBER(1),
    END_LOTTO_NUMBER(45),
    LOTTO_NUMBER_COUNT(6)
    ;

    private final int value;

    Rule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
