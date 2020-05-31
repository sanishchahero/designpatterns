package com.blogspot.itsmesanish.singleton;

import java.util.*;

/**
 * @author Sanish
 */
public class SingletonCard {
    private static SingletonCard card = null;
    private String[] cards = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private List<String> cardLists = new LinkedList<>(Arrays.asList(cards));

    private SingletonCard() {
    }

    public static SingletonCard getInstance() {
        if (Objects.isNull(card)) {
            synchronized (SingletonCard.class) {
                if (Objects.isNull(card)) {
                    card = new SingletonCard();
                    Collections.shuffle(card.cardLists);
                }
            }
        }
        return card;
    }

    public List<String> getCards() {
        return card.cardLists;
    }

    public List<String> getSpecificNumberOfCards(int number) {
        List<String> selectedCards = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            selectedCards.addAll(Collections.singleton(card.cardLists.remove(0)));
        }
        return selectedCards;
    }
}
