package com.xo.view;

import com.xo.controller.Game;

public class ConsoleView {

    protected final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName(){
        System.out.println(game.getGameName());
    }

    public void showPlayersName(){
        System.out.println(game.getPlayers());
    }

}
