package racingcar.domain;

import racingcar.constants.ErrorMessage;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validate(cars);
        this.cars = cars;
    }

    private void validate(List<Car> cars) {
        validateDuplicateCar(cars);
    }

    private void validateDuplicateCar(List<Car> cars) {
        int size = cars.size();

        for (int index = 0; index < size; index++) {
            if (isDuplicateCar(cars.get(index), cars.subList(index + 1, size))) {
                throw new IllegalArgumentException(ErrorMessage.DUPLICATE_NAME.getText());
            }
        }
    }

    private boolean isDuplicateCar(Car car, List<Car> cars) {
        return cars.stream()
                .anyMatch(carToCompare -> carToCompare.isDuplicateCar(car));
    }
}
