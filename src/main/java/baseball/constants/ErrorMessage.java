package baseball.constants;

public enum ErrorMessage {

    INVALID_NUMBER("숫자를 다시 입력해주세요");
    private static final String PREFIX = "[ERROR]";
    private String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return PREFIX + " " + text;
    }
}
