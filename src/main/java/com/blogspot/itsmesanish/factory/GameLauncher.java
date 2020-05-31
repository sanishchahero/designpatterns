package com.blogspot.itsmesanish.factory;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Sanish
 */
public class GameLauncher {
    public static final Logger LOG = Logger.getLogger(GameLauncher.class.getSimpleName());

    public static void main(String[] args) {
        GameFactory factory = new GameFactory();
        Scanner scanner = new Scanner(System.in);
        LOG.info("Play (ACTION / FPS) game::: ");
        String input = scanner.next();
        Game game = factory.lauchGame(input);
        game.play();
    }
}
