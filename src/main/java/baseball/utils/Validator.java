package baseball.utils;

import baseball.exception.InvalidNumberException;

public class Validator {
    public void validateNumber(String numbers) {
        for (int index = 0; index < numbers.length(); index++) {
            if (numbers.charAt(index) < '0' || numbers.charAt(index) > '9') {
                throw new InvalidNumberException("숫자를 다시 입력해주세요");
            }
        }
    }
}
