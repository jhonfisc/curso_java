package com.soccermatchsimulator.core;

public class Player {
    private boolean isPlayerStar;
    private int position;
    private String name;

    public Player(int position, String name) {
        this(position, name, false);
    }

    public Player(int position, String name, boolean isPlayerStar) {
        this.position = position;
        this.isPlayerStar = isPlayerStar;
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isStar() {
        return isPlayerStar == true;
    }
}
