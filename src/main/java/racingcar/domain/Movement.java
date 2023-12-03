package racingcar.domain;

import racingcar.utils.MovementGenerator;

public class Movement {
    private final Integer moveCount;

    public Movement(Integer movement) {
        this.moveCount = movement;
    }

    public Integer move(MovementGenerator movementGenerator) {
        int movedCount = 0;

        if (movementGenerator.generate() >= 4) {
            movedCount++;
        }

        return movedCount;
    }

    public int size() {
        return moveCount;
    }
}
