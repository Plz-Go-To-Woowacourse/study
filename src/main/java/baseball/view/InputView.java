package baseball.view;

import baseball.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public List<Integer> inputNumbers() {
        String input = inputValue();

        validator.validateNumber(input);

        List<Integer> numbers = new ArrayList<>();

        for (int index = 0; index < input.length(); index++) {
            numbers.add(Character.getNumericValue(input.charAt(index)));
        }

        return numbers;
    }

    public int inputNumber() {
        String input = inputValue();

        validator.validateNumber(input);

        return Integer.parseInt(input);
    }

    private String inputValue() {
        return Console.readLine();
    }
}
