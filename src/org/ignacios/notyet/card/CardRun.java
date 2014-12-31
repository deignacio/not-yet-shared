package org.ignacios.notyet.card;

import java.util.List;

/**
 * Interface representing a run of cards.
 */
public interface CardRun {

    /**
     * @param card a card
     * @return true if the card can legally be added to the run
     */
    boolean doesCardExtendRun(Card card);

    /**
     * Calculates the number of cards between the provided card
     * and the card run.
     * NOTE:  A card already inside the run, or a card that extends the run
     * will return 0.
     * @param card a card
     * @return the number of cards between the provided card and the card run.
     */
    int distanceFromRun(Card card);

    /**
     * attempt to add a {@link Card} to the run
     * @param card the card to add
     * @return the new card run
     * @throws IllegalArgumentException if the card cannot be added to the run
     */
    CardRun addCard(Card card);

    /**
     * @return the cards inside this run.
     */
    List<Card> getCards();

    /**
     * @return the point value of the card run
     */
    int getValue();
}
