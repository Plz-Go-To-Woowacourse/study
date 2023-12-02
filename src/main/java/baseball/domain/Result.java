package baseball.domain;

import java.util.stream.IntStream;

import static baseball.constants.DomainConstants.MAX_SIZE;
import static baseball.constants.DomainConstants.MIN_SIZE;

public class Result {
    private final Integer ballCount;
    private final Integer strikeCount;

    public Result(MyNumber myNumber, ComputerNumber computerNumber) {
        this.ballCount = calculateBall(myNumber, computerNumber);
        this.strikeCount = calculateStrike(myNumber, computerNumber);
    }

    private Integer calculateStrike(MyNumber myNumber, ComputerNumber computerNumber) {
        return (int) IntStream.range(MIN_SIZE, MAX_SIZE)
                .filter(i -> myNumber.getNumberIndex(i).equals(computerNumber.getNumberIndex(i)))
                .count();
    }

    private Integer calculateBall(MyNumber myNumber, ComputerNumber computerNumber) {
        return (int) IntStream.range(MIN_SIZE, MAX_SIZE)
                .filter(i -> !myNumber.getNumberIndex(i).equals(computerNumber.getNumberIndex(i)) &&
                        computerNumber.contains(myNumber.getNumberIndex(i)))
                .count();
    }

    public Boolean isGameOver() {
        return strikeCount.equals(3);
    }

    @Override
    public String toString() {
        if (ballCount == 0 && strikeCount == 0) {
            return "낫싱";
        }

        if (ballCount == 0) {
            return strikeCount + "스트라이크";
        }

        if (strikeCount == 0) {
            return ballCount + "볼";
        }

        return ballCount + "볼 " + strikeCount + "스트라이크";
    }
}
