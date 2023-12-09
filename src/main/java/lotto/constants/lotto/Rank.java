package lotto.constants.lotto;

import java.util.Arrays;

public enum Rank {
    FIRST(BonusMatch.NOT_RELEVANT, 6),
    SECOND(BonusMatch.RELEVANT, 5),
    THIRD(BonusMatch.RELEVANT, 5),
    FOURTH(BonusMatch.NOT_RELEVANT, 4),
    FIFTH(BonusMatch.NOT_RELEVANT, 3),
    NO_PLACE(BonusMatch.NOT_RELEVANT, 0);

    private final BonusMatch bonusMatch;
    private final int matchCount;

    Rank(BonusMatch bonusMatch, int matchCount) {
        this.bonusMatch = bonusMatch;
        this.matchCount = matchCount;
    }

    public static BonusMatch checkBonusMatch(int matchCount) {
        Rank result = Arrays.stream(Rank.values())
                .filter(rank -> rank.matchCount == matchCount)
                .findAny()
                .orElse(NO_PLACE);

        return result.bonusMatch;
    }

    public BonusMatch getBonusMatch() {
        return bonusMatch;
    }
}
