package com.soccermatchsimulator;

import com.soccermatchsimulator.core.Match;
import com.soccermatchsimulator.core.SimulationEngine;
import com.soccermatchsimulator.core.Team;

public class Main {

    public static void main(String[] args) {
	    Team teamHome = new Team("Home",3,4,3);
        Team teamAway = new Team("Away",2,4,4);

        Match match = new Match(teamHome, teamAway);

        SimulationEngine simulationEngine = new SimulationEngine(match);
        simulationEngine.simulateMatch();

        System.out.println(match.getMatchLog());
    }
}
