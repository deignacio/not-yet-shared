package org.ignacios.notyet.player;

import org.ignacios.notyet.state.GameState;

/**
 * Interface that all bots must implement.
 */
public interface Player {

    /**
     * Performs the player's turn.
     * @param gameState the current state of the state
     * @return the {@link Action} to perform
     */
    Action playTurn(GameState gameState);
}
