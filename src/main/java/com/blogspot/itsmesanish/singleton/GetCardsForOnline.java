package com.blogspot.itsmesanish.singleton;

import java.util.logging.Logger;

/**
 * @author Sanish
 */
public class GetCardsForOnline implements Runnable {
    private static final Logger LOG = Logger.getLogger(GetCardsForOnline.class.getSimpleName());

    @Override
    public void run() {
        SingletonCard player = SingletonCard.getInstance();
        LOG.info("Identify hashcode: " + System.identityHashCode(player));
        LOG.info("" + player.getCards());
        LOG.info("" + player.getSpecificNumberOfCards(1));
    }
}
