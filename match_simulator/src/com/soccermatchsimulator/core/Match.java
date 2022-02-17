package com.soccermatchsimulator.core;

public class Match {

    private String score;
    private int scoreHome;
    private int scoreAway;
    private Team teamHome;
    private Team teamAway;
    private String matchLog = "";
    private String currentLog = "";

    public Match(Team teamHome, Team teamAway) {
        this.teamHome = teamHome;
        this.teamAway = teamAway;
    }

    public void generateProbabilityBars() {
        setProbabilityBarHome();
        setProbabilityBarAway();
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public void setMatchLog(String matchLog) {
        this.matchLog = this.matchLog + matchLog;
        this.currentLog = matchLog;
    }

    public String getMatchLog() {
        return matchLog;
    }

    public void addGoal(boolean homeTeam) {
        if(homeTeam) {
            scoreHome += 1;
        } else {
            scoreAway += 1;
        }
    }

    public String getScore() {
        return scoreHome + " - " + scoreAway;
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
