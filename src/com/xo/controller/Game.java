package com.xo.controller;

import com.xo.model.Player;

public class Game {

    private static final String GAME_NAME = "XO";

    private Player[] players;

    public String getGameName(){
        return GAME_NAME;
    }

    public Player[] getPlayers() {
        return players;
    }
}
