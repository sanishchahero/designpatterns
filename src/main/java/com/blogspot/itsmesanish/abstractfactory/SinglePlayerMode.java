package com.blogspot.itsmesanish.abstractfactory;

/**
 * @author Sanish
 * Factory
 */
public class SinglePlayerMode extends Mode {
    @Override
    Game getGame(String gameType) {
        return gameType.equalsIgnoreCase("ACTION") ? new ActionSinglePlayerGame() : new FPSSinglePlayerGame();
    }
}
