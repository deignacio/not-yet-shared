package org.ignacios.notyet.state;

import org.ignacios.notyet.card.CardRun;
import org.ignacios.notyet.player.PlayerId;

import java.util.Set;

/**
 * Class containing the state of a player.
 */
public interface PlayerState {

    /**
     * @return the player's id
     */
    PlayerId getPlayerId();

    /**
     * @return the player's card runs
     */
    Set<CardRun> getCardRuns();

    /**
     * @return the number of chips the player has
     */
    int getChipCount();

    /**
     * @return the player's current score
     */
    int getScore();
}
