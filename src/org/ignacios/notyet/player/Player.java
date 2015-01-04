package org.ignacios.notyet.player;

import org.ignacios.notyet.state.GameState;
import org.ignacios.notyet.state.PlayerState;

/**
 * Interface that all bots must implement.
 */
public interface Player {

    /**
     * Performs the player's turn.
     * @param gameState the current state of the state
     * @param playerState the state of the current player
     * @return the {@link Action} to perform
     */
    Action playTurn(GameState gameState, PlayerState playerState);
}
