package racingcar.domain;

import racingcar.constants.ErrorMessage;
import racingcar.service.RacingCarService;
import racingcar.utils.RandomNumberGenerator;

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

    public void registerCar(RacingCarService racingCarService) {
        for (Car car: cars){
            racingCarService.addCar(car);
        }
    }

    public void race(RacingCarService racingCarService, RandomNumberGenerator randomNumberGenerator) {
        for (Car car: cars) {
            racingCarService.moveCar(car, randomNumberGenerator.createRandomNumber());
        }
    }
}
