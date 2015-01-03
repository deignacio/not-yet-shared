package org.ignacios.notyet.card;

import java.util.List;

/**
 * Interface representing a run of cards.
 */
public interface CardRun {

    /**
     * @param card a card
     * @return true if the card can be legally added to the front of the run
     */
    boolean doesCardPrependRun(Card card);

    /**
     * @param card a card
     * @return true if the card can legally be added to the run
     */
    boolean doesCardExtendRun(Card card);

    /**
     * Calculates the number of cards between the provided card
     * and the card run's lowest card.
     * NOTE:  A card already inside the run, or an empty run (can that happen?) will return 0
     * NOTE:  Cards whose value is higher than the card run's lowest card, but not a
     * part of the card run will return -1
     * @param card a card
     * @return the number of cards between the provided card and the card run's lowest card.
     */
    int distanceFromStart(Card card);

    /**
     * Calculates the number of cards between the provided card
     * and the card run's highest card.
     * NOTE:  A card already inside the run, or an empty run (can that happen?) will return 0
     * NOTE:  Cards whose value is lower than the card run's highest card, but not a
     * part of the card run will return -1
     * @param card a card
     * @return the number of cards between the provided card and the card run's lowest card.
     */
    int distanceFromEnd(Card card);

    /**
     * @return the cards inside this run.
     */
    List<Card> getCards();

    /**
     * @return the point value of the card run
     */
    int getValue();
}
