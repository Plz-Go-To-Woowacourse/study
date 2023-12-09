package lotto.exception.message;

public enum ErrorMessage {
    INVALID_PRICE("[ERROR] 잘못된 금액을 입력하셨습니다. 금액에는 숫자만 들어가야 합니다."),
    LOTTO_DUPLICATED("[ERROR] 로도는 중복된 값이 들어갈 수 없습니다."),
    INVALID_WINNING_NUMBER_NUMERIC("[ERROR] 잘못된 번호를 입력하셨습니다. 번호는 콤마를 제외하번 숫자만 들어가야 합니다."),
    INVALID_WINNING_NUMBER_SIZE("[ERROR] 잘못된 번호를 입력하셨습니다. 6개의 번호를 입력해야 합니다."),
    INVALID_WINNING_NUMBER_DUPLICATED("[ERROR] 잘못된 번호를 입력하셨습니다. 번호는 중복된 값이 들어갈 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
