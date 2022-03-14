package com.soccermatchsimulator;

import com.soccermatchsimulator.core.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList();
        initTeam(players);

        ArrayList<Player> players2 = new ArrayList();
        initTeam(players2);

	    Teamv2 teamHome = new Teamv2("Home", players);
        Teamv2 teamAway = new Teamv2("Away", players2);

        Match match = new Match(teamHome, teamAway);

        SimulationEngine simulationEngine = new SimulationEngine(match);
        simulationEngine.simulateMatch();

        System.out.println(match.getMatchLog());
    }

    private static void initTeam(ArrayList<Player> players) {
        players.add(new Player(Constants.DEFENSES, "Player1"));
        players.add(new Player(Constants.DEFENSES, "Player2", true));
        players.add(new Player(Constants.DEFENSES, "Player3", true));
        players.add(new Player(Constants.DEFENSES, "Player4"));

        players.add(new Player(Constants.MIDFIELDERS, "Player5"));
        players.add(new Player(Constants.MIDFIELDERS, "Player6"));
        players.add(new Player(Constants.MIDFIELDERS, "Player7"));

        players.add(new Player(Constants.FORWARDS, "Player8"));
        players.add(new Player(Constants.FORWARDS, "Player9", true));
        players.add(new Player(Constants.FORWARDS, "Player10"));
    }
}
