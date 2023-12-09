package lotto.constants.expression;

public enum Seperator {
    LOTTO_NUMBER(", "),
    WINNING_NUMBER(","),
    LOTTO_STATISTICS("---")
    ;

    private final String value;

    Seperator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
