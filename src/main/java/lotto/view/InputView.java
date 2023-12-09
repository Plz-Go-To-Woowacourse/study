package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.PurchasedLotto;

public class InputView {
    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public Integer buyLotto() {
        String price = Console.readLine();
        validator.validate();

        return Integer.parseInt(price);
    }
}
