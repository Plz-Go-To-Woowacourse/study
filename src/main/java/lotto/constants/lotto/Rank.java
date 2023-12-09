package lotto.constants.lotto;

public enum Rank {
    FIRST("6개 번호 일치", 6, BonusMatch.NOT_RELEVANT, 2_000_000_000),
    SECOND("5개 번호 + 보너스 번호 일치", 5, BonusMatch.MATCH, 30_000_000),
    THIRD("5개 번호 일치", 5, BonusMatch.NO_MATCH, 1_500_000),
    FOURTH("4개 번호 일치", 4, BonusMatch.NOT_RELEVANT, 50_000),
    FIFTH("3개 번호 일치", 3, BonusMatch.NOT_RELEVANT, 5_000);

    private final String standard;
    private final int matchCount;
    private final BonusMatch bonusMatch;
    private final int prize;

    Rank(String standard, int matchCount, BonusMatch bonusMatch, int prize) {
        this.standard = standard;
        this.matchCount = matchCount;
        this.bonusMatch = bonusMatch;
        this.prize = prize;
    }

    public String getStandard() {
        return standard;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public BonusMatch getBonusMatch() {
        return bonusMatch;
    }

    public int getPrize() {
        return prize;
    }
}
