package racingcar.utils;

import racingcar.constants.ErrorMessage;

import java.util.Arrays;

public class Validator {
    public void validateNumber(String number) {
        for (int index = 0; index < number.length(); index++) {
            if (!isNumber(number.charAt(index))){
                throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER.getText());
            }
        }
    }

    private boolean isNumber(char number) {
        return number >= '0' && number <= '9';
    }
}
