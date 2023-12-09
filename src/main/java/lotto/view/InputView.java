package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.Parser;
import lotto.utils.Validator;

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
        String winningNumber = Console.readLine().trim();
        validator.validateWinningNumber(Parser.convertToList(winningNumber));

        return Parser.convertWinningNumber(winningNumber);
    }

    public Integer inputBonusNumber() {
        String bonusNumber = Console.readLine().trim();
        validator.validateBonusNumber(bonusNumber);

        return Integer.parseInt(bonusNumber);
    }
}
