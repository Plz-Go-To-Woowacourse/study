package lotto.constants.lotto;

public enum Price {
    PRICE_OF_LOTTO(1_000)
    ;

    private final int value;

    Price(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
