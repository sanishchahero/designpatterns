package com.blogspot.itsmesanish.abstractfactory;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Sanish
 */
public class GameLauncher {
    public static final Logger LOG = Logger.getLogger(GameLauncher.class.getSimpleName());

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LOG.info("Play (ACTION / FPS) game::: ");
        String gameType = input.nextLine();
        Mode mode = ModeSelector.getMode(true);
        Game game = mode.getGame(gameType);
        game.play();
    }
}
