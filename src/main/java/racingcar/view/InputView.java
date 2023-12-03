package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public List<String> inputCars() {
        String carName = Console.readLine();
        List<String> carNames = Arrays.asList(carName.split(","));
        validator.validate(carNames);

        return carNames;
    }
}
