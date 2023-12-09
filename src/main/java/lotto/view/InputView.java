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

    public int inputPurchaseAmount() {
        String purchaseAmount = inputValue();

        inputValidator.validateNumber(purchaseAmount);

        return Integer.parseInt(purchaseAmount);
    }

    public List<Integer> inputWinningNumbers() {
        String[] numbers = inputValue().split(Seperator.WINNING_NUMBER.getValue());
        List<Integer> winningNumbers = new ArrayList<>();

        for (int index = 0; index < numbers.length; index++){
            inputValidator.validateNumber(numbers[index]);
            winningNumbers.add(Integer.parseInt(numbers[index]));
        }

        return winningNumbers;
    }

    private String inputValue() {
        return Console.readLine().replaceAll(" ", "");
    }
}
