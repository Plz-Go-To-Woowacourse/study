package racingcar.constants;

public enum ErrorMessage {
    NAME_LENGTH_OUT_OF_RANGE("자동차의 이름은 5 이하만 가능합니다");

    private final static String PREFIX = "[ERROR]";
    private final String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return PREFIX + " " + text;
    }
}
