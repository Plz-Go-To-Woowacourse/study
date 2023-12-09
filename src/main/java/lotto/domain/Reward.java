package lotto.domain;

public enum Reward {
    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    NOTHING(0, 0);

    private final Integer matchCount;
    private final Integer reward;

    Reward(Integer matchCount, Integer reward) {
        this.matchCount = matchCount;
        this.reward = reward;
    }

    public static Reward valueOf(Integer correctNumber, Boolean isCorrectBonusNumber) {
        for (Reward reward : values()) {
            if (correctNumber.equals(5) && isCorrectBonusNumber) {
                return SECOND;
            }

            if (reward.matchCount.equals(correctNumber)) {
                return reward;
            }
        }

        return NOTHING;
    }

    public Integer getReward() {
        return reward;
    }
}
