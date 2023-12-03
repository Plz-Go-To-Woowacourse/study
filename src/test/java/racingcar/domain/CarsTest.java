package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    @DisplayName("이름이 중복 되는 자동차 객체가 있는 경우 예외를 발생 시킨다")
    @Test
    void createCars() {
        List<Car> cars = List.of(
                new Car("ming"),
                new Car("taro"),
                new Car("wow"),
                new Car("taro"));

        assertThatThrownBy(() -> new Cars(cars))
                .isInstanceOf(IllegalArgumentException.class);
    }
}