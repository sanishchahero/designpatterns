package com.blogspot.itsmesanish.abstractfactory;

/**
 * @author Sanish
 * Factory generator / selector
 */
public class ModeSelector {
    public static Mode getMode(boolean isSinglePlayer) {
        return isSinglePlayer ? new SinglePlayerMode() : new MultiPlayerMode();
    }
}
