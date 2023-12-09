package lotto.constants.message;

import lotto.constants.lotto.Rule;

public enum ErrorMessage {
    INVALID_NUMBER("숫자를 입력해 주세요."),
    INVALID_LOTTO_PURCHASE_AMOUNT("로또는 1,000원 단위로 구매 가능 합니다."),
    INVALID_UNIQUE_NUMBERS("로또 번호는 중복될 수 없습니다."),
    INVALID_LOTTO_COUNT(String.format("%s개의 번호를 입력해 주세요.", Rule.LOTTO_NUMBER_COUNT.getValue())),
    INVALID_BONUS_NUMBER("보너스 번호는 당첨 번호와 중복될 수 없습니다."),
    INVALID_LOTTO_NUMBER(String.format("로또 번호는 %d~%d 사이의 숫자만 가능 합니다.",
            Rule.START_LOTTO_NUMBER.getValue(), Rule.END_LOTTO_NUMBER.getValue()))
    ;

    private final String PREFIX = "[ERROR]";
    private final String text;

    ErrorMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return PREFIX + " " + text;
    }
}
