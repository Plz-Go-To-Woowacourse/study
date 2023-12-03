package racingcar.domain;

import racingcar.constants.ErrorMessage;

import java.util.List;

public class Car {
    final private String name;

    public Car(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (!isLengthWithinRange(name)) {
            throw new IllegalArgumentException(ErrorMessage.NAME_LENGTH_OUT_OF_RANGE.getText());
        }
    }

    private boolean isLengthWithinRange(String name) {
        return name.length() <= racingcar.constants.Car.NAME_MAX_LENGTH.getValue();
    }

    public boolean isDuplicateCar(Car car) {
        return car.isDuplicateName(name);
    }

    private boolean isDuplicateName(String name) {
        return this.name.equals(name);
    }
}
