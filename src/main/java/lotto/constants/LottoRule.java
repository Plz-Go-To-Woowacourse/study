package lotto.constants;

public enum LottoRule {
    START_LOTTO_NUMBER(1),
    END_LOTTO_NUMBER(45),
    LOTTO_NUMBER_COUNT(6)
    ;

    private final int value;

    LottoRule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
