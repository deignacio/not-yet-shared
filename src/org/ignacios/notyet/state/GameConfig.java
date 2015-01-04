package org.ignacios.notyet.state;

import org.ignacios.notyet.card.Card;

import java.util.List;

/**
 * Class containing the initial game state
 */
public interface GameConfig {

    /**
     * @return the smallest possible card in the game
     */
    Card getMinCard();

    /**
     * @return the largest possible card in the game
     */
    Card getMaxCard();

    /**
     * @return the number of cards randomly removed from the deck
     */
    int getNumberOfCardsRemoved();

    /**
     * @return the initial chip count of each player
     */
    int getNumberOfChipsPerPlayer();

    /**
     * @return the turn order of the players
     */
    List<PlayerId> getPlayerOrder();
}
