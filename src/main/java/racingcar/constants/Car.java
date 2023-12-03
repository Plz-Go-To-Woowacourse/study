package racingcar.constants;

public enum Car {
    NAME_MAX_LENGTH(5);

    private final int value;

    Car(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
