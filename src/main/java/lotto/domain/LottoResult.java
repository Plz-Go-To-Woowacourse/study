package lotto.domain;

public class LottoResult {
    private final Integer correctNumber;
    private final Boolean isCorrectBonusNumber;

    public LottoResult(Integer correctNumber, Boolean isCorrectBonusNumber) {
        this.correctNumber = correctNumber;
        this.isCorrectBonusNumber = isCorrectBonusNumber;
    }

    @Override
    public String toString() {
        return "LottoResult{" +
                "correctNumber=" + correctNumber +
                ", isCorrectBonusNumber=" + isCorrectBonusNumber +
                '}';
    }
}
