package lotto.utils;

import lotto.Exception.InvalidNumberException;
import lotto.constants.ErrorMessage;
import lotto.constants.RegularExpression;

public class InputValidator {
    public void validateNumber(String number) {
        String string = number.replaceAll(RegularExpression.NUMBER.getText(), "");

        if (!string.isEmpty()) {
            throw new InvalidNumberException(ErrorMessage.INVALID_NUMBER.getText());
        }
    }
}
