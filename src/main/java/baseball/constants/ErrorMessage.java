package baseball.constants;

public enum ErrorMessage {

    INVALID_NUMBER("숫자를 다시 입력해 주세요"),
    INVALID_NUMBER_SIZE(Rule.NUMBER_COUNT.getValue() + "개의 숫자만 입력 가능 합니다."),
    DUPLICATE_NUMBER("중복 되지 않은 숫자를 입력해 주세요"),
    INVALID_ATTEMPT("잘못된 입력 입니다."),
    BLANK_INPUT("빈 값은 입력할 수 없습니다.");

    private static final String PREFIX = "[ERROR]";
    private String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return PREFIX + " " + text;
    }
}
