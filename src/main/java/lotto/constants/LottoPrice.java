package lotto.constants;

public enum LottoPrice {
    PRICE_OF_LOTTO(1_000)
    ;

    private final int value;

    LottoPrice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
