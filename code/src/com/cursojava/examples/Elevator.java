package com.cursojava.examples;

public class Elevator {
    public int callLevel;
    public int currentLevel = 1;
    final int MAX_LEVEL;
    final int MIN_LEVEL;
    public boolean isOpenDoor;
    public boolean isCloseDoor = true;
    final String SUCCESS_MESSAGE = "Piso aceptado!";
    final String ERROR_MESSAGE = "Piso no aceptado!";

    public Elevator() {
        this.MAX_LEVEL = 10;
        this.MIN_LEVEL = 1;
    }

    public Elevator(int maxLevel, int minLevel) {
        this.MAX_LEVEL = maxLevel;
        this.MIN_LEVEL = minLevel;
    }

    public boolean isAcceptedLevel(int testLevel) {
        return (testLevel >= this.MIN_LEVEL && testLevel <= this.MAX_LEVEL);
    }

    public void verifyLevel(int testLevel) {
        if (this.isAcceptedLevel(testLevel)) {
            System.out.println(SUCCESS_MESSAGE);
        } else {
            System.out.println(ERROR_MESSAGE);
        }
    }

    public void goUp() {
        if (isCloseDoor  && isMaxLevel()) {
            currentLevel++;
        }
    }

    public void goDown() {
        if (isCloseDoor) {
            currentLevel--;
        }
    }

    public void openDoor() {
        if (callLevel == currentLevel) {
            isOpenDoor = true;
            isCloseDoor = false;
        } else {
            isOpenDoor = false;
            isCloseDoor = true;
        }
    }

    public void closeDoor() {
        if (callLevel == currentLevel && isOpenDoor) {
            isCloseDoor = true;
            isOpenDoor = false;
        }
    }

    protected boolean isMaxLevel() {
        return !(currentLevel ==  MAX_LEVEL);
    }
}
