package racingcar.domain;

import racingcar.utils.MovementGenerator;

public class Movement {
    private final Integer moveCount;

    public Movement(Integer movement) {
        this.moveCount = movement;
    }

    public Integer move(MovementGenerator movementGenerator) {
        int movedCount = 0;
        for (int i = 0; i < moveCount; i++) {
            if (movementGenerator.generate() >= 4) {
                movedCount ++;
            }
        }

        return movedCount;
    }
}
