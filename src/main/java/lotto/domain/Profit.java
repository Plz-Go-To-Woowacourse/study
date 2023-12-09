package lotto.domain;

public class Profit {
    private final double profit;

    public Profit(double roundedProfitRate) {
        this.profit = roundedProfitRate;
    }

    @Override
    public String toString() {
        return "총 수익률은 " + profit +"%입니다.";
    }
}
