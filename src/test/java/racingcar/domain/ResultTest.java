package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    private static Stream<Arguments> resultsTest() {
        return Stream.of(
                Arguments.of(new HashMap<String, Integer>() {{
                    put("pobi", 1);
                    put("suni", 2);
                    put("woni", 3);
                }}, "woni")
        );
    }

    @DisplayName("우승자를 추려내는지")
    @ParameterizedTest
    @MethodSource("resultsTest")
    void getWinnersTest(Map<String, Integer> results, String expectedWinner) {
        // given
        Result result = new Result(results);

        // when
        List<String> actualWinners = result.getWinners();

        // then
        assertThat(actualWinners).isEqualTo(List.of(expectedWinner));
    }
}