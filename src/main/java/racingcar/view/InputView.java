package racingcar.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constants.Mark;

public class InputView {
    public List<String> inputCarNames() {
        String[] names = inputValue().split(Mark.CAR_NAME_SEPERATOR.getText());

        return new ArrayList<>(Arrays.asList(names));
    }

    private String inputValue() {
        return Console.readLine();
    }
}
