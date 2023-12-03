package racingcar.domain;

import racingcar.constants.ErrorMessage;
import racingcar.constants.Rule;

public class Car {
    final private String name;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        validateNameLength(name);
    }

    private void validateNameLength(String name) {
        if (!isLengthWithinRange(name)) {
            throw new IllegalArgumentException(ErrorMessage.NAME_LENGTH_OUT_OF_RANGE.getText());
        }
    }

    private boolean isLengthWithinRange(String name) {
        return name.length() <= Rule.NAME_MAX_LENGTH.getValue();
    }

    public boolean isDuplicateCar(Car car) {
        return car.isDuplicateName(name);
    }

    private boolean isDuplicateName(String name) {
        return this.name.equals(name);
    }
}
