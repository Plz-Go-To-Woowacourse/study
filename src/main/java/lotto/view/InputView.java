package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.Parser;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public Integer buyLotto() {
        String price = Console.readLine();
        validator.validatePrice(price);

        return Integer.parseInt(price);
    }

    public List<Integer> inputWinningNumber() {
        String winningNumber = Console.readLine();
        validator.validateWinningNumber(winningNumber);

        return Parser.convertWinningNumber(winningNumber);
    }
}
