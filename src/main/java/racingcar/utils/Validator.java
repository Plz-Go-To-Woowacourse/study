package racingcar.utils;

import java.util.List;

public class Validator {
    private static final String NUMERIC = ".*\\d.*";
    private static final String ONLY_NUMERIC = "^[0-9]+$";
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

    private Boolean isNumeric(String carName) {
        return carName.matches(NUMERIC);
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

        if (!isOnlyNumeric(movement)) {
            throwException();
        }
    }

    private Boolean isOnlyNumeric(String movement) {
        return movement.matches(ONLY_NUMERIC);
    }

    private void throwException() {
        throw new IllegalArgumentException();
    }
}
