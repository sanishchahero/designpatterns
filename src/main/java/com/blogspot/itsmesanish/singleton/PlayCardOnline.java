package com.blogspot.itsmesanish.singleton;

import java.util.logging.Logger;

/**
 * @author Sanish
 */
public class PlayCardOnline {
    private static final Logger LOG = Logger.getLogger(PlayCardOnline.class.getSimpleName());

    public static void main(String[] args) {
        LOG.info("Playing cards online");
        Runnable player1 = new GetCardsForOnline();
        Runnable player2 = new GetCardsForOnline();

        new Thread(player1).start();
        new Thread(player2).start();
    }
}
