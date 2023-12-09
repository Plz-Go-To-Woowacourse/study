package lotto;

import lotto.domain.Lotto;
import lotto.domain.vo.BonusNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    // 아래에 추가 테스트 작성 가능

    @DisplayName("당첨 번호와 보너스 번호를 받고 보너스 번호를 제외하고 맞은 개수를 정확히 세는지")
    @Test
    void countNumberTest() {
        // given
        List<Integer> actualNumbers = List.of(1,2,3,4,5,6);
        List<Integer> expectedNumbers = List.of(4,5,6,7,8,9);
        BonusNumber bonusNumber = new BonusNumber("7");
        Lotto lotto = new Lotto(actualNumbers);

        // when
        Integer actualCount = lotto.countNumber(expectedNumbers, bonusNumber);

        // then
        assertThat(actualCount).isEqualTo(3);
    }

    @DisplayName("가진 로또 중 보너스 번호가 있는지")
    @ParameterizedTest
    @CsvSource(value = {"6, true", "7, false"})
    void isCorrectBonusNumberTest(String expectedBonus, Boolean expectedResult) {
        // given
        List<Integer> actualNumbers = List.of(1,2,3,4,5,6);
        BonusNumber bonusNumber = new BonusNumber(expectedBonus);
        Lotto lotto = new Lotto(actualNumbers);

        // when
        Boolean actual = lotto.isCorrectBonusNumber(bonusNumber);

        // then
        assertThat(expectedResult).isEqualTo(actual);
    }
}