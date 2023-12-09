package lotto.constants;

public enum OutputMessage {
    PURCHASE_AMOUNT_INPUT("구입금액을 입력해 주세요."),
    LOTTO_PURCHASE_COUNT("%d개를 구매했습니다."),
    WINNING_NUMBER_INPUT("당첨 번호를 입력해 주세요."),
    BONUS_NUMBER_INPUT("보너스 번호를 입력해 주세요."),
    WINNING_STATISTICS("당첨 통계"),
    RATE_OF_RETURN("총 수익률은 62.5%입니다."),
    LOTTO_NUMBERS("[%s]")
    ;

    private final String text;

    OutputMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
