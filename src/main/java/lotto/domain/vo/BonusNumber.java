package lotto.domain.vo;

import java.util.List;

public class BonusNumber {
    private final Integer bonusNumber;

    public BonusNumber(Integer bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    public Boolean hasBonusNumber(Integer number) {
        return number.equals(this.bonusNumber);
    }

    public Boolean hasBonusNumberInList(List<Integer> numbers) {
        return numbers.contains(this.bonusNumber);
    }
}
