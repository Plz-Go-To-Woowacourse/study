package lotto.exception.payload;

public enum ErrorMessage {
    INVALID_PRICE_NUMERIC("[ERROR] 잘못된 금액을 입력하셨습니다. 금액에는 숫자만 들어가야 합니다."),
    INVALID_LOTTO_DUPLICATED("[ERROR] 로도는 중복된 값이 들어갈 수 없습니다."),
    INVALID_WINNING_NUMBER_NUMERIC("[ERROR] 잘못된 당첨 번호를 입력하셨습니다. 번호는 콤마를 제외하번 숫자만 들어가야 합니다."),
    INVALID_WINNING_NUMBER_EMPTY("[ERROR] 잘못된 당첨 번호를 입력하셨습니다. 입력되지 않는 번호가 있습니다."),
    INVALID_WINNING_NUMBER_SIZE("[ERROR] 잘못된 당첨 번호를 입력하셨습니다. 6개의 번호를 입력해야 합니다."),
    INVALID_WINNING_NUMBER_DUPLICATED("[ERROR] 잘못된 당첨 번호를 입력하셨습니다. 번호는 중복된 값이 들어갈 수 없습니다."),
    INVALID_BONUS_NUMBER_NUMERIC("[ERROR] 잘못된 보너스 번호를 입력하셨습니다. 보너스 번호는 숫자만 들어가야 합니다."),
    INVALID_BONUS_NUMBER_SIZE("[ERROR] 잘못된 번호를 입력하셨습니다. 보너스 번호는 1개만 입력해야 합니다."),
    INVALID_BONUS_NUMBER_DUPLICATED("[ERROR] 잘못된 보너스 번호를 입력하셨습니다. 보너스 번호는 중복된 값이 들어갈 수 없습니다."),
    INVALID_BONUS_NUMBER_EMPTY("[ERROR] 잘못된 보너스 번호를 입력하셨습니다. 아무런 값도 입력되지 않았습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
