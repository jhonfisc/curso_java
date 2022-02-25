package com.cursojava.examples;

public class ElevatorOddLevels extends Elevator {

    private static final int MIN_LEVEL = 1;
    private static final int MAX_LEVEL = 10;

    public ElevatorOddLevels() {
        this(MAX_LEVEL);
    }

    public ElevatorOddLevels(int maxLevel) {
        super(maxLevel, MIN_LEVEL);
    }

    @Override
    public void goUp() {
        if (isCloseDoor  && isMaxLevel()) {
            if (currentLevel == MIN_LEVEL) {
                currentLevel = 3;
            } else {
                currentLevel += 2;
            }
        }
    }

    @Override
    public void goDown() {
        if (isCloseDoor) {
            if ((currentLevel - 2) == MIN_LEVEL) {
                currentLevel = MIN_LEVEL;
            } else {
                currentLevel -= 2;
            }
        }
    }
}
