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

    }

    public Integer getNumberIndex(Integer index) {
        return number.get(index);
    }
}
