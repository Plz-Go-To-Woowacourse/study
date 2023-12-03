package racingcar.view;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constants.Mark;
import racingcar.domain.Car;
import racingcar.utils.Validator;

public class InputView {
    private Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public List<Car> inputCarNames() {
        String[] names = inputValue().split(Mark.CAR_NAME_SEPARATOR.getText());
        List<Car> carNames = new ArrayList<>();

        for (String name: names) {
            carNames.add(new Car(name.trim()));
        }

        return carNames;
    }

    public int inputAttemptCount() {
        String attempt = inputValue();

        validator.validateNumber(attempt);

        return Integer.parseInt(attempt);
    }

    private String inputValue() {
        return Console.readLine();
    }
}
