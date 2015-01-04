package org.ignacios.notyet.state;

import com.google.common.base.Optional;
import org.ignacios.notyet.card.Card;
import org.ignacios.notyet.turn.Turn;

import java.util.List;
import java.util.Set;

/**
 * Class containing the state of a game.
 */
public interface GameState {

    /**
     * @return the initial game state
     */
    InitialState getInitialState();

    /**
     * @return the number of cards left in the deck
     */
    int getNumberOfCardsLeft();

    /**
     * @return the cards already seen in the game, does not include the current card
     */
    Set<Card> getCardsTaken();

    /**
     * @return the card currently up for bid
     */
    Optional<Card> getCurrentCard();

    /**
     * @return the number of chips in the pot
     */
    int getCurrentChipCount();

    /**
     * @param playerId a playerId
     * @return the provided player's state, absent if that playerId is invalid
     */
    Optional<PlayerState> getPlayerState(PlayerId playerId);

    /**
     * @return a list of all turns made in the game so far
     */
    List<Turn> getTurns();
}
