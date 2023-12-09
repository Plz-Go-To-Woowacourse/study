package lotto.exception.message;

public enum ErrorMessage {
    INVALID_PRICE("[ERROR] 잘못된 금액을 입력하셨습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
