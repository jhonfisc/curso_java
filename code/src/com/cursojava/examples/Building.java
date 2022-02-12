package com.cursojava;

public class Building {
    private Elevator[] elevators;

    public Building(Elevator[] elevators) {
        this.elevators = elevators;
    }

    public Elevator getElevatorLeft() {
        return elevators[0];
    }

    public Elevator getElevatorCenter() {
        return elevators[1];
    }

    public Elevator getElevatorRight() {
        return elevators[2];
    }
}
