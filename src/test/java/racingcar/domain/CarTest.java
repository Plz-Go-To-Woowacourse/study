package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @DisplayName("두 자동차의 이름이 같다면 같은 자동차 임을 확인 한다")
    @Test
    void validateDuplicateCar() {
        Car firstCar = new Car("ming");
        Car secondCar = new Car("ming");

        Assertions.assertTrue(firstCar.isDuplicateCar(secondCar));
    }

    @DisplayName("두 자동차의 이름이 다르다면 다른 자동차 임을 확인 한다")
    @Test
    void validateNotDuplicateCar() {
        Car firstCar = new Car("ming");
        Car secondCar = new Car("taro");

        Assertions.assertFalse(firstCar.isDuplicateCar(secondCar));
    }

    @DisplayName("이름이 5자를 넘어가면 자동차 객체 생성시 예외가 발생 한다")
    @ValueSource(strings = {"abcdef", "mingming", "123mingss"})
    @ParameterizedTest
    void createCar(String carName) {
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}