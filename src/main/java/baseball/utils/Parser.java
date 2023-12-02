package baseball.utils;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Integer> convertToList(String number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.add(Character.getNumericValue(number.charAt(i)));
        }

        return numbers;
    }
}
