package com.blogspot.itsmesanish.factory;

/**
 * @author Sanish
 */
public class GameFactory {
    public Game lauchGame(String gameType) {
        return (gameType.equalsIgnoreCase("ACTION")) ? new ActionGame() : new FPSGame();
    }
}
