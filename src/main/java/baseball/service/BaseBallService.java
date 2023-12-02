package baseball.service;

import baseball.domain.ComputerNumber;
import baseball.domain.MyNumber;
import baseball.domain.Result;

public class BaseBallService {
    private static final String RESTART = "1";
    private static final String GAME_STOP = "2";

    public Result compareNumbers(MyNumber myNumber, ComputerNumber computerNumber) {
        return new Result(myNumber, computerNumber);
    }

    public Boolean isValid(String restart) {
        if (!restart.equals(RESTART) && !restart.equals(GAME_STOP)) {
            throw new IllegalArgumentException();
        }

        return restart.equals(GAME_STOP);
    }
}
