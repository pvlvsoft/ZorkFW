package com.github.pvlvsoft.zorkFW.core.game;

import com.github.pvlvsoft.zorkFW.core.player.Player;
import com.github.pvlvsoft.zorkFW.core.utils.errors.AlreadyInTheGameException;

import java.util.List;

/**
 * <p>This interface defines behavior of the {@link Game} with as many as needed {@link Player} instances.</p>
 *
 * <p>Alternatively, the schema of player management can be simplified by using the {@link SinglePlayerGame}.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface MultiPlayerGame {


    /**
     * <p>Returns a list of players currently in the game.</p>
     *
     * @return  {@link List} of {@link Player}s the {@link MultiPlayerGame} has at the time.
     */
    public List<Player> getPlayers();


    /**
     * <p>This method allows adding the {@link Player} instance to the game.</p>
     *
     * @param player    {@link Player} to be added to the game.
     *
     * @throws AlreadyInTheGameException    when there already is such a player.
     */
    public void addPlayerToGame(Player player) throws AlreadyInTheGameException;


    /**
     * <p>This method is responsible for the {@link Player} removing.
     * When there is no need for the player or is kicked by the game logic,
     * it can be terminated using this method.</p>
     *
     * @param player    {@link Player} instance to be removed from the game.
     */
    public void removePlayerFromGame(Player player);


    /**
     * <p>This method is able to return the number of {@link Player}s in the game.</p>
     *
     * @return  {@code int}-formed number of {@link Player}s in the {@link MultiPlayerGame}.
     */
    public int getNumberOfPlayers();


    /**
     * <p>This method clears the field of the {@link Player}s.</p>
     */
    public void clearPlayers();
}
