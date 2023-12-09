package lotto.domain;

public class LottoResult {
    private final Reward reward;

    public LottoResult(Integer correctNumber, Boolean isCorrectBonusNumber) {
        this.reward = Reward.valueOf(correctNumber, isCorrectBonusNumber);
    }

    public Reward getReward() {
        return reward;
    }
}
