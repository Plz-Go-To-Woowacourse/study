package lotto;

import lotto.controller.LottoController;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;
import lotto.utils.Validator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoController lottoController = new LottoController(
                new InputView(new Validator()),
                new OutputView(),
                new LottoService());
        lottoController.run();
    }
}
