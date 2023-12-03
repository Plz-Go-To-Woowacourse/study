package racingcar.domain;

import racingcar.utils.MovementGenerator;

import static racingcar.constants.DomainConstants.MOVE_STANDARD;
import static racingcar.constants.DomainConstants.START_MOVED_COUNT;

public class Movement {
    private final Integer moveCount;

    public Movement(Integer movement) {
        this.moveCount = movement;
    }

    public Integer move(MovementGenerator movementGenerator) {
        int movedCount = START_MOVED_COUNT;

        if (movementGenerator.generate() >= MOVE_STANDARD) {
            movedCount++;
        }

        return movedCount;
    }

    public int size() {
        return moveCount;
    }
}
