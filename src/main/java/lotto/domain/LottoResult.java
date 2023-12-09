package lotto.domain;

public class LottoResult {
    private final Integer correctNumber;
    private final Boolean isCorrectBonusNumber;
    private final Reward reward;


    public LottoResult(Integer correctNumber, Boolean isCorrectBonusNumber) {
        this.correctNumber = correctNumber;
        this.isCorrectBonusNumber = isCorrectBonusNumber;
        this.reward = Reward.valueOf(correctNumber, isCorrectBonusNumber);
    }

    public Reward getReward() {
        return reward;
    }
}
