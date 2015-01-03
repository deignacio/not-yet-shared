package org.ignacios.notyet.turn;

import org.ignacios.notyet.card.Card;
import org.ignacios.notyet.player.Action;
import org.ignacios.notyet.state.PlayerId;

public interface Turn {

    /**
     * @return the player taking the turn
     */
    PlayerId getPlayerId();

    /**
     * @return the card that was present
     */
    Card getCard();

    /**
     * @return the number of chips that were present
     */
    int getChipCount();

    /**
     * @return the action taken
     */
    Action getAction();
}
