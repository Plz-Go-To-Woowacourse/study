package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.constants.Seperator;
import lotto.utils.InputValidator;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private final InputValidator inputValidator;

    public InputView(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public int inputNumber() {
        String purchaseAmount = inputValue();

        inputValidator.validateNumber(purchaseAmount);

        return Integer.parseInt(purchaseAmount);
    }

    public List<Integer> inputNumbers() {
        String[] inputs = inputValue().split(Seperator.WINNING_NUMBER.getValue());
        List<Integer> numbers = new ArrayList<>();

        for (int index = 0; index < inputs.length; index++){
            inputValidator.validateNumber(inputs[index]);
            numbers.add(Integer.parseInt(inputs[index]));
        }

        return numbers;
    }

    private String inputValue() {
        return Console.readLine().replaceAll(" ", "");
    }
}
