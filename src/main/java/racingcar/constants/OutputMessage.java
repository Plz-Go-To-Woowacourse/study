package racingcar.constants;

public enum OutputMessage {
    CAR_NAME_INPUT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ATTEMP_REQUEST("시도할 회수는 몇회인가요?"),
    RACING_RESULT("실행 결과"),
    CAR_NAME_AND_RACING_RESULT("%s : %s"),
    WINNER("최종 우승자 : %s");

    private final String text;

    OutputMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
