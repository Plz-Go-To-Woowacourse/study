package racingcar.domain;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static racingcar.constants.DomainConstants.*;

public class Result {
    private final Map<String, Integer> result;

    public Result(Map<String, Integer> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return result.entrySet()
                .stream()
                .map(entry -> entry.getKey() + SEPARATOR + SYMBOL.repeat(entry.getValue()))
                .collect(Collectors.joining(LINE_BREAK));
    }

    public List<String> getWinners() {
        Integer maxPosition = Collections.max(result.values());

        return result.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), maxPosition))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
