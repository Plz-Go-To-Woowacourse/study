package racingcar.utils;

import java.util.List;

public class Validator {
    private static final String NUMERIC = ".*\\d.*";

    public void validateCarNames(List<String> carNames) {
        for (String carName : carNames) {
            if (isNumeric(carName)) {
                throwException();
            }

            if (!isValidSize(carName)) {
                throwException();
            }

            if (carName.isBlank()) {
                throwException();
            }
        }
    }

    private Boolean isValidSize(String carName) {
        return carName.length() <= 5;
    }

    public void validateMovement(String movement) {
        if (movement.isBlank()) {
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
