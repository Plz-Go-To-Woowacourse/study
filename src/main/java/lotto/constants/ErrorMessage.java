package lotto.constants;

public enum ErrorMessage {
    INVALID_NUMBER("숫자를 입력해주세요.");

    private final String PREFIX = "[ERROR]";
    private final String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
