package com.soccermatchsimulator.core;

import java.util.ArrayList;

public class Teamv2 extends Team {

    private static final double ADD_PERCENT_PLAYER_STAR_IN_ATTACK = 0.03;
    private static final double ADD_PERCENT_PLAYER_STAR_IN_DEFENSE = 0.02;
    private ArrayList<Player> players = new ArrayList();

    public Teamv2(String teamName, ArrayList<Player> players) {
        super(teamName, getPlayers(players, Constants.FORWARDS), getPlayers(players, Constants.MIDFIELDERS),
                getPlayers(players, Constants.DEFENSES));
        this.players = players;
    }

    public Teamv2(String teamName, int forwards, int midfielders, int defenses) {
        super(teamName, forwards, midfielders, defenses);
    }

    private static int getPlayers(ArrayList<Player> players, int position) {
        int numPlayers = 0;
        for(Player player : players) {
            if (player.getPosition() == position) {
                numPlayers++;
            }
        }
        return numPlayers;
    }

    @Override
    protected void calculateInternalProbabilityAttack() {
        double probabilityAttack = (this.getFormation()[Constants.FORWARDS] * this.PROBABILITY_ATTACK) + haveStarPlayers(Constants.FORWARDS);
    }

    @Override
    public double getProbabilityDefense() {
        return (this.getFormation()[Constants.DEFENSES] * this.PROBABILITY_DEFENSE) + haveStarPlayers(Constants.DEFENSES);
    }

    private double haveStarPlayers(int position) {
        return getPlayersStar(position) * ((position == Constants.FORWARDS) ? this.ADD_PERCENT_PLAYER_STAR_IN_ATTACK : this.ADD_PERCENT_PLAYER_STAR_IN_DEFENSE);
    }

    private int getPlayersStar(int position) {
        int numPlayers = 0;
        for(Player player : players) {
            if (player.getPosition() == position && player.isStar()) {
                numPlayers++;
            }
        }
        return numPlayers;
    }

}
