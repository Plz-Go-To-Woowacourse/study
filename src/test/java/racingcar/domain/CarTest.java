package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("두 자동차의 이름이 같다면 같은 자동차 임을 확인 한다")
    void validateDuplicateCar() {
        Car firstCar = new Car("ming");
        Car secondCar = new Car("ming");

        Assertions.assertTrue(firstCar.isDuplicateCar(secondCar));
    }

    @Test
    @DisplayName("두 자동차의 이름이 다르다면 다른 자동차 임을 확인 한다")
    void validateNotDuplicateCar() {
        Car firstCar = new Car("ming");
        Car secondCar = new Car("taro");

        Assertions.assertFalse(firstCar.isDuplicateCar(secondCar));
    }
}