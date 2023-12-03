package racingcar.view;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constants.Mark;
import racingcar.domain.Car;

public class InputView {
    public List<Car> inputCarNames() {
        String[] names = inputValue().split(Mark.CAR_NAME_SEPERATOR.getText());
        List<Car> carNames = new ArrayList<>();

        for (String name: names) {
            carNames.add(new Car(name));
        }

        return carNames;
    }

    private String inputValue() {
        return Console.readLine();
    }
}
