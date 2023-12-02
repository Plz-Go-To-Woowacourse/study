package baseball.domain;

import baseball.utils.Parser;

import java.util.List;

public class MyNumber {
    private final List<Integer> number;

    public MyNumber(String number) {
        validate(number);
        this.number = Parser.convertToList(number);
    }

    private void validate(String number) {
        if (!isValidSize(number)) {
            throwException();
        }
    }

    private Boolean isValidSize(String number) {
        return number.length() == 3;
    }

    private void throwException() {
        throw new IllegalArgumentException();
    }

    public Integer getNumberIndex(Integer index) {
        return number.get(index);
    }
}
