package racingcar.constants;

public enum ErrorMessage {
    NAME_LENGTH_OUT_OF_RANGE("자동차의 이름은 5 이하만 가능 합니다."),
    DUPLICATE_NAME("중복 되는 자동차 이름은 입력할 수 없습니다."),
    NOT_NUMBER("숫자를 다시 입력해 주세요."),
    INVALID_ATTEMPT("시도 횟수는 1 이상의 숫자만 가능 합니다.");

    private final static String PREFIX = "[ERROR]";
    private final String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return PREFIX + " " + text;
    }
}
