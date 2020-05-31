package com.blogspot.itsmesanish.abstractfactory;

/**
 * @author Sanish
 * Abstract Factory
 */
public abstract class Mode {
    abstract Game getGame(String gameType);
}
