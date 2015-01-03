package org.ignacios.notyet.card;

/**
 * Class representing a playing card
 */
public interface Card extends Comparable<Card> {

    /**
     * @return the value of the card, and how many points it is worth
     */
    int getValue();

    /**
     * @param card the card to compare to
     * @return true if the provided card is directly before this card
     */
    boolean isBefore(Card card);

    /**
     * @param card the card to compare to
     * @return true if the provided card is directly after this card
     */
    boolean isAfter(Card card);
}
