package baseball.utils;

import baseball.constants.ErrorMessage;
import baseball.exception.InvalidNumberException;

public class Validator {
    public void validateNumber(String numbers) {
        for (int index = 0; index < numbers.length(); index++) {
            if (numbers.charAt(index) < '0' || numbers.charAt(index) > '9') {
                throw new InvalidNumberException(ErrorMessage.INVALID_NUMBER.getText());
            }
        }
    }
}
