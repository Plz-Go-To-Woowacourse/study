package baseball.domain;

import baseball.utils.Parser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.constants.DomainConstants.Blank;
import static baseball.constants.DomainConstants.MAX_SIZE;

public class MyNumber {
    private final List<Integer> number;

    public MyNumber(String number) {
        validate(number);
        this.number = Parser.convertToList(number);
    }

    private void validate(String number) {
        if (isDuplicated(number)) {
            throwException();
        }

        if (!isValidSize(number)) {
            throwException();
        }

        if (hasBlank(number)) {
            throwException();
        }

        if (!isNumeric(number)) {
            throwException();
        }
    }

    private Boolean isDuplicated(String number) {
        Set<Character> numbers = new HashSet<>();
        for (char digit : number.toCharArray()) {
            if (!numbers.add(digit)) {
                return true;
            }
        }

        return false;
    }

    private Boolean isNumeric(String number) {
        return number.matches("^[\\d]*$");
    }

    private Boolean hasBlank(String number) {
        return number.contains(Blank);
    }

    private Boolean isValidSize(String number) {
        return number.length() == MAX_SIZE;
    }

    private void throwException() {
        throw new IllegalArgumentException();
    }

    public Integer getNumberIndex(Integer index) {
        return number.get(index);
    }
}
