package racingcar.domain;

import racingcar.constants.Car;
import racingcar.constants.ErrorMessage;

import java.util.List;

public class Cars {
    private final List<String> names;

    public Cars(List<String> names) {
        validateCarNameLength(names);
        this.names = names;
    }

    private void validateCarNameLength(List<String> names) {
        for (String name: names){
            if (!isLengthWithinRange(name)) {
                throw new IllegalArgumentException(ErrorMessage.NAME_LENGTH_OUT_OF_RANGE.getText());
            }
        }
    }

    private boolean isLengthWithinRange(String name) {
        return name.length() <= Car.NAME_MAX_LENGTH.getValue();
    }
}
