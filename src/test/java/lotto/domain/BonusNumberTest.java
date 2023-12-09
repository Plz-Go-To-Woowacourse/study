package lotto.domain;

import lotto.Exception.InvalidLottoException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BonusNumberTest {

    @DisplayName("당첨번호에 보너스 번호가 이미 존재하면 예외를 발생한다")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    @ParameterizedTest
    void createBonusNumber(int bonusNumber) {
        Lotto winningLotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));

        assertThatThrownBy(() -> new BonusNumber(bonusNumber, winningLotto))
                .isInstanceOf(InvalidLottoException.class);
    }
}