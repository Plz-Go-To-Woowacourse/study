package racingcar.utils;

import java.util.List;

public class Validator {
    private static final String NUMERIC = ".*\\d.*";
    private static final String WHITE_SPACE = " ";

    public void validateCarNames(List<String> carNames) {
        for (String carName : carNames) {
            if (isNumeric(carName)) {
                throwException();
            }

            if (!isValidSize(carName)) {
                throwException();
            }

            if (hasBlank(carName)) {
                throwException();
            }
        }
    }

    private Boolean hasBlank(String value) {
        return value.isBlank() || value.contains(WHITE_SPACE);
    }

    private Boolean isValidSize(String carName) {
        return carName.length() <= 5;
    }

    public void validateMovement(String movement) {
        if (hasBlank(movement)) {
            throwException();
        }

        if (!isNumeric(movement)) {
            throwException();
        }
    }

    private Boolean isNumeric(String name) {
        return name.matches(NUMERIC);
    }

    private void throwException() {
        throw new IllegalArgumentException();
    }
}
