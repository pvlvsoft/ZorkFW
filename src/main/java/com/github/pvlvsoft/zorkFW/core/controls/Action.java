package com.github.pvlvsoft.zorkFW.core.controls;


import com.github.pvlvsoft.zorkFW.core.Room;
import com.github.pvlvsoft.zorkFW.core.item.Item;
import com.github.pvlvsoft.zorkFW.core.player.Player;

/**
 * <p>This interface defines the same base of all controlled actions
 * in the game environment.</p>
 *
 * <p>The core of the {@link Action} is the actual action invoker
 * - {@link Action#execute()} method in this case. This provides
 * various dynamic game control tools, such as moving from one
 * {@link Room} to another, picking up {@link Item}s or invoke some
 * activity by the game logic.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface Action {

    /**
     * <p>This method guarantee the {@link Action} is gonna be
     * executed on the method calling.</p>
     *
     * <p>Every action instance may has it's own implementation
     * (ie it's own way of doing the action).</p>
     */
    public void execute();


    /**
     * <p>This method is meant to be used for letting the </p>
     * @return
     */
    public Player getPlayer();
}
