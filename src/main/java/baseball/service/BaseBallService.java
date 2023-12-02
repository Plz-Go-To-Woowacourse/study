package baseball.service;

import baseball.domain.ComputerNumber;
import baseball.domain.MyNumber;
import baseball.domain.Result;

public class BaseBallService {
    public Result compareNumbers(MyNumber myNumber, ComputerNumber computerNumber) {
        return new Result(myNumber, computerNumber);
    }
}
