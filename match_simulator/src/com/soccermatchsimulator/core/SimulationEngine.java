package com.soccermatchsimulator.core;

public class SimulationEngine {

    private static final double MAX_NUMBER = 100;
    private static final int MINUTES = 5;
    private static final int MAX_MINUTES = 90;
    private static final int POSITION_DEFENSE = 1;
    private static final int POSITION_ATTACK = 2;
    private static final String DEFENSE = "Defense";
    private static final String ATTACK = "Attack";
    private static final String OTHER = "Other";
    private static final String HOME_TEAM = "Home Team";
    private static final String AWAY_TEAM = "Away Team";

    private boolean homeTeamPlay = true;
    private Match match;
    private int currentPosition = 0;

    public SimulationEngine(Match match) {
        this.match = match;
        generateProbabilityBars();
    }

    public void simulateMatch() {
        double roll;
        for(int minute = 0; minute <= MAX_MINUTES; minute += MINUTES) {
            roll = rollDice();
            currentPosition = getPosition(roll);
            isGoal();
            homeTeamPlay = !homeTeamPlay;
            match.setMatchLog("Score minute " + minute + ": " + match.getScore() + ". Team: "+ getTeamLog() +" Position: " + getPositionLog() + "\n");
        }
    }

    private void isGoal() {
        if (currentPosition == POSITION_ATTACK) {
            match.addGoal(homeTeamPlay);
        }
    }

    private int getPosition(double roll) {
        if (homeTeamPlay) {
            return match.getTeamHome().getTeamPosition(roll);
        }
        return match.getTeamAway().getTeamPosition(roll);
    }

    private double rollDice() {
        return (Math.random() * MAX_NUMBER) + 1;
    }

    private void generateProbabilityBars() {
        match.generateProbabilityBars();
    }

    private String getPositionLog() {
        if (currentPosition == POSITION_DEFENSE) {
            return DEFENSE;
        } else if (currentPosition == POSITION_ATTACK) {
            return ATTACK;
        } else {
            return OTHER;
        }
    }

    private String getTeamLog() {
        if (homeTeamPlay) {
            return HOME_TEAM;
        }
        return AWAY_TEAM;
    }
}
