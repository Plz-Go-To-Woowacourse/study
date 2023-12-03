package racingcar.constants;

public enum Mark {
    CAR_NAME_SEPERATOR(","),
    WINNER_SEPERATOR(", "),
    CAR_FORWARD("-");

    private final String text;

    Mark(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
