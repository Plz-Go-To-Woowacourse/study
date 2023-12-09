package lotto.constants;

public enum ErrorMessage {
    INVALID_NUMBER("숫자를 입력해 주세요."),
    INVALID_LOTTO_PURCHASE_AMOUNT("로또는 1,000원 단위로 구매 가능 합니다.");

    private final String PREFIX = "[ERROR]";
    private final String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return PREFIX + " " + text;
    }
}
