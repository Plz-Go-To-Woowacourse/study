package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.InputValidator;

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

    private String inputValue() {
        return Console.readLine();
    }
}
