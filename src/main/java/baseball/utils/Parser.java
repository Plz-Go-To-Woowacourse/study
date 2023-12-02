package baseball.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    public static List<Integer> convertToList(String number) {
        return number.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }
}
