package lotto.constants;

public enum Seperator {
    LOTTO_NUMBER(", "),
    WINNING_NUMBER(",")
    ;

    private final String value;

    Seperator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
