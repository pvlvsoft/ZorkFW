package com.github.pvlvsoft.zorkFW.core.game;

import com.github.pvlvsoft.zorkFW.core.player.Player;

/**
 * <p>This interface defines functionality of the {@link Game} and allows specify the number of
 * the {@link Player}s in the game at the same time - to the only 1 maximum.</p>
 *
 * <p>Implementor may use the {@link MultiPlayerGame} interface alternatively.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface SinglePlayerGame {


    /**
     * <p>Returns the only player of the game.</p>
     *
     * @return  The only {@link Player} playing the game.
     */
    public Player getPlayer();
}
