package com.soccermatchsimulator.core;

public class Team {
    private static final int BAR_ATTACK_INDEX = 1;
    private static final int BAR_DEFENSE_INDEX = 0;
    public static final double PROBABILITY_DEFENSE = 5;
    public static final double PROBABILITY_ATTACK = 5;
    private static final int POSITION_DEFENSE = 1;
    private static final int POSITION_ATTACK = 2;
    private static final int POSITION_OTHER = 3;
    private int[] formation = { 0, 0, 0 };
    private double[] probabilityBar = { 0, 0 };
    private double probabilityAttack;
    private String teamName;

    public Team(String teamName, int forwards, int midfielders, int defenses) {
        this.teamName = teamName;
        this.formation[Constants.FORWARDS] = forwards;
        this.formation[Constants.MIDFIELDERS] = midfielders;
        this.formation[Constants.DEFENSES] = defenses;
        this.calculateInternalProbabilityAttack();
    }

    public double getProbabilityAttack() {
        return probabilityAttack;
    }

    public void setProbabilityAttack(double probabilityAttack) {
        this.probabilityAttack = probabilityAttack;
    }

    public void setProbabilityDefense(double oppositionChance) {
        this.probabilityBar[BAR_DEFENSE_INDEX] = oppositionChance;
    }

    public double getProbabilityDefense() {
        return this.formation[Constants.DEFENSES] * this.PROBABILITY_DEFENSE;
    }

    public void setProbabilityAttack() {
        this.probabilityBar[BAR_ATTACK_INDEX] = this.probabilityBar[BAR_DEFENSE_INDEX] + this.probabilityAttack;
    }

    public int getTeamPosition(double roll) {
        if( roll > this.probabilityBar[BAR_DEFENSE_INDEX] && roll <= this.probabilityBar[BAR_ATTACK_INDEX]) {
            return POSITION_ATTACK;
        } else if (roll < this.probabilityBar[BAR_DEFENSE_INDEX]) {
            return POSITION_DEFENSE;
        }
        return POSITION_OTHER;
    }

    protected void calculateInternalProbabilityAttack() {
        this.probabilityAttack = this.formation[Constants.FORWARDS] * this.PROBABILITY_ATTACK;
    }
    public int[] getFormation() {
        return formation;
    }

    public void setFormation(int[] formation) {
        this.formation = formation;
    }

}
