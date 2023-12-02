package baseball.constants;

public enum OutputMessage {
    START("숫자 야구 게임을 시작합니다."),
    NUMBER_INPUT("숫자를 입력해주세요 : "),
    END("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RETRY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    BALL("%d볼"),
    STRIKE("%d스트라이크");

    private final String text;

    OutputMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
