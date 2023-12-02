package baseball.service;

import baseball.domain.ComputerNumber;
import baseball.domain.MyNumber;
import baseball.domain.Result;

public class BaseBallService {
    public Result compareNumbers(MyNumber myNumber, ComputerNumber computerNumber) {
        return new Result(myNumber, computerNumber);
    }

    public Boolean isValid(String restart) {
        if (!restart.equals("1") && !restart.equals("2")) {
            throw new IllegalArgumentException();
        }

        return restart.equals("2");
    }
}
