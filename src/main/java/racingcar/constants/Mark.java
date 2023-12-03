package racingcar.constants;

public enum Mark {
    CAR_NAME_SEPARATOR(","),
    WINNER_SEPARATOR(", "),
    CAR_FORWARD("-");

    private final String text;

    Mark(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
