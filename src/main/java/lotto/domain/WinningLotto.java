package lotto.domain;

import lotto.domain.vo.BonusNumber;

import java.util.List;

public class WinningLotto {
    private final List<Integer> winningNumbers;
    private final BonusNumber bonusNumber;

    public WinningLotto(List<Integer> winningNumbers, Integer bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = new BonusNumber(bonusNumber);
    }
}
