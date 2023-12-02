package baseball.domain;

import baseball.constants.ErrorMessage;
import baseball.constants.Rule;
import baseball.exception.InvalidAttemptException;

public class Attempt {
    private final int attempt;

    public Attempt(int attempt) {
        validate(attempt);
        this.attempt = attempt;
    }

    private void validate(int attempt) {
        if (attempt != Rule.RETRY_GAME.getValue() && attempt != Rule.END_GAME.getValue()) {
            throw new InvalidAttemptException(ErrorMessage.INVALID_ATTEMPT.getText());
        }
    }

    public boolean isEnd() {
        return attempt == Rule.END_GAME.getValue();
    }
}
