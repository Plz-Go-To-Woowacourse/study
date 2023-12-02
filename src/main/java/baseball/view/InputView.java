package baseball.view;

import baseball.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public int[] inputNumber() {
        String input = inputValue();

        validator.validateNumber(input);

        int[] numbers = new int[3];

        for (int index = 0; index < 3; index++) {
            numbers[index] = (int)input.charAt(index);
        }

        return numbers;
    }

    private String inputValue() {
        return Console.readLine();
    }
}
