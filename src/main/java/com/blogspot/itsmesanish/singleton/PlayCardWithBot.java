package com.blogspot.itsmesanish.singleton;

import java.util.logging.Logger;

/**
 * @author Sanish
 */
public class PlayCardWithBot {
    private static final Logger LOG = Logger.getLogger(PlayCardWithBot.class.getSimpleName());

    public static void main(String[] args) {
        LOG.info("Playing cards with bot");

        SingletonCard player = SingletonCard.getInstance();
        System.out.println("Identify hashcode: " + System.identityHashCode(player));
        System.out.println(player.getCards());
        System.out.println(player.getSpecificNumberOfCards(1));

        SingletonCard bot = SingletonCard.getInstance();
        System.out.println("Identify hashcode: " + System.identityHashCode(player));
        System.out.println(bot.getCards());
        System.out.println(player.getSpecificNumberOfCards(1));
    }
}
