package lotto.constants.expression;

public enum RegularExpression {
    NUMBER("[0-9]")
    ;

    private final String text;

    RegularExpression(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
