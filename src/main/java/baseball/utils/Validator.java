package baseball.utils;

import baseball.constants.ErrorMessage;
import baseball.constants.Rule;
import baseball.exception.InvalidNumberException;

public class Validator {
    public void validateNumber(String numbers) {
        for (int index = 0; index < numbers.length(); index++) {
            if (!isNumber(numbers.charAt(index))) {
                throw new InvalidNumberException(ErrorMessage.INVALID_NUMBER.getText());
            }
        }
    }

    private boolean isNumber(char number) {
        number -= '0';

        return number >= Rule.RANDOM_NUMBER_START.getValue()
                && number <= Rule.RANDOM_NUMBER_END.getValue();
    }
}
