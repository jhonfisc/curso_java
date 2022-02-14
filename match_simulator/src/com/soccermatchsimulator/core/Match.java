package com.soccermatchsimulator.core;

public class Match {

    private String score;
    private int scoreHome;
    private int scoreAway;
    private Team teamHome;
    private Team teamAway;

    public Match(Team teamHome, Team teamAway) {
        this.teamHome = teamHome;
        this.teamAway = teamAway;
    }

    public void generateProbabilityBars() {
        setProbabilityBarHome();
        setProbabilityBarAway();
    }

    public String getScore() {
        return scoreHome + " - " + scoreAway;
    }

    public void getGraphicProbabilityBarHome() {
        teamHome.getGraphicProbabilityBar();
    }

    public void getGraphicProbabilityBarAway() {
        teamAway.getGraphicProbabilityBar();
    }

    private void setProbabilityBarHome() {
        teamHome.setProbabilityDefense(teamAway.getProbabilityDefense());
        teamHome.setProbabilityAttack();
    }

    private void setProbabilityBarAway() {
        teamAway.setProbabilityDefense(teamHome.getProbabilityDefense());
        teamAway.setProbabilityAttack();
    }
}
