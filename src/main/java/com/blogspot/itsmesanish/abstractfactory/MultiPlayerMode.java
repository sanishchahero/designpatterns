package com.blogspot.itsmesanish.abstractfactory;

/**
 * @author Sanish
 * Factory
 */
public class MultiPlayerMode extends Mode {
    @Override
    Game getGame(String gameType) {
        return gameType.equalsIgnoreCase("ACTION") ? new ActionMultiPlayerGame() : new FPSMultiPlayerGame();
    }
}
