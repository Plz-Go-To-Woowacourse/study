package lotto;

import lotto.service.LottoService;
import lotto.controller.LottoMachine;
import lotto.utils.InputValidator;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        LottoMachine lottoMachine =
                new LottoMachine(
                        new InputView(new InputValidator()),
                        new OutputView(),
                        new LottoService(new ArrayList<>(), new HashMap<>())
                );

        lottoMachine.start();
    }
}
