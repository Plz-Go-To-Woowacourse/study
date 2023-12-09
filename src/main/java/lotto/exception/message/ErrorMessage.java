package lotto.exception.message;

public enum ErrorMessage {
    INVALID_PRICE("[ERROR] 잘못된 금액을 입력하셨습니다."),
    DUPLICATED("[ERROR] 로도는 중복된 값이 들어갈 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
