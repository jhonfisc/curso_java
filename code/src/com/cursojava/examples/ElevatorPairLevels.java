package com.cursojava.examples;

public class ElevatorPairLevels extends Elevator {

    private static final int MIN_LEVEL = 1;

    public ElevatorPairLevels(int maxLevel) {
        super(maxLevel, MIN_LEVEL);
    }

    @Override
    public void goUp() {
        if (isCloseDoor  && isMaxLevel()) {
            if (currentLevel == MIN_LEVEL) {
                currentLevel = 2;
            } else {
                currentLevel += 2;
            }
        }
    }

    @Override
    public void goDown() {
        if (isCloseDoor) {
            if ((currentLevel - 1) == MIN_LEVEL) {
                currentLevel = MIN_LEVEL;
            } else {
                currentLevel -= 2;
            }
        }
    }
}
