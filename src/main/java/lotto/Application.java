package lotto;

import lotto.controller.LottoMachine;
import lotto.utils.InputValidator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {
        LottoMachine lottoMachine =
                new LottoMachine(
                        new InputView(new InputValidator()),
                        new OutputView()
                );

        lottoMachine.start();
    }
}
