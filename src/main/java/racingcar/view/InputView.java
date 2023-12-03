package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

import java.util.Arrays;
import java.util.List;

import static racingcar.constants.ViewConstants.SPLIT_STANDARD;

public class InputView {
    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public List<String> inputCars() {
        String carName = Console.readLine();
        List<String> carNames = Arrays.asList(carName.split(SPLIT_STANDARD));
        validator.validateCarNames(carNames);

        return carNames;
    }

    public Integer inputMovement() {
        String movement = Console.readLine();
        validator.validateMovement(movement);

        return Integer.parseInt(movement);
    }
}
