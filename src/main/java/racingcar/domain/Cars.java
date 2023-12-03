package racingcar.domain;

import racingcar.constants.Car;
import racingcar.constants.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private final List<String> names;

    public Cars(List<String> names) {
        validate(names);
        this.names = names;
    }

    private void validate(List<String> names) {
        validateCarNameLength(names);
        validateDuplicateName(names);
    }

    private void validateCarNameLength(List<String> names) {
        for (String name: names){
            if (!isLengthWithinRange(name)) {
                throw new IllegalArgumentException(ErrorMessage.NAME_LENGTH_OUT_OF_RANGE.getText());
            }
        }
    }

    private void validateDuplicateName(List<String> names) {
        Set<String> copyNames = new HashSet<>(names);

        if (copyNames.size() != names.size()) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATE_NAME.getText());
        }
    }

    private boolean isLengthWithinRange(String name) {
        return name.length() <= Car.NAME_MAX_LENGTH.getValue();
    }
}
