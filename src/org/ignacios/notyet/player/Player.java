package org.ignacios.notyet.player;

import org.ignacios.notyet.state.GameConfig;
import org.ignacios.notyet.state.GameState;
import org.ignacios.notyet.state.PlayerState;
import org.ignacios.notyet.turn.Turn;

import java.util.List;

/**
 * Interface that all bots must implement.
 */
public interface Player {

    /**
     * Performs the player's turn.
     * @param config the configuration of the game
     * @param gameState the current state of the state
     * @param playerState the state of the current player
     * @param turns list of all turns taken in the game
     * @return the {@link Action} to perform
     */
    Action playTurn(GameConfig config, GameState gameState, PlayerState playerState, List<Turn> turns);
}
