package com.soccermatchsimulator.core;

import java.util.ArrayList;

public class Teamv2 extends Team {

    private static final double ADD_PERCENT_PLAYER_STAR_IN_ATTACK = 0.03;
    private static final double ADD_PERCENT_PLAYER_STAR_IN_DEFENSE = 0.02;
    private final ArrayList<Player> players;

    public Teamv2(String teamName, ArrayList<Player> players) {
        super(teamName, getPlayers(players, Constants.FORWARDS), getPlayers(players, Constants.MIDFIELDERS), getPlayers(players, Constants.DEFENSES));
        this.players = players;
    }

    private static int getPlayers(ArrayList<Player> players, int position) {
        return (int) players.stream().filter(player -> player.getPosition() == position).count();
    }

    @Override
    protected void calculateInternalProbabilityAttack() {
        setProbabilityAttack((this.getFormation()[Constants.FORWARDS] * this.PROBABILITY_ATTACK) + haveStarPlayers(Constants.FORWARDS));
    }

    @Override
    public double getProbabilityDefense() {
        return (this.getFormation()[Constants.DEFENSES] * this.PROBABILITY_DEFENSE) + haveStarPlayers(Constants.DEFENSES);
    }

    private double haveStarPlayers(int position) {
        return getPlayersStar(position) * ((position == Constants.FORWARDS) ? this.ADD_PERCENT_PLAYER_STAR_IN_ATTACK : this.ADD_PERCENT_PLAYER_STAR_IN_DEFENSE);
    }

    private int getPlayersStar(int position) {
        return (int) players.stream().filter(player -> player.getPosition() == position && player.isStar()).count();
    }

}
