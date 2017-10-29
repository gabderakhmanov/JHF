package com.xo;

import com.xo.controller.Game;
import com.xo.view.AdvConsoleView;
import com.xo.view.ConsoleView;

public class Main {

    public static void main(String[] args) {

        final Game game = new Game();

        AdvConsoleView advConsoleView = new AdvConsoleView(game);
        startGame(advConsoleView);

    }

    private static void startGame(final ConsoleView advConsoleView){
        advConsoleView.showGameName();
    }


}
