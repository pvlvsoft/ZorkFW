package com.github.pvlvsoft.zorkFW.core.game;


import com.github.pvlvsoft.zorkFW.core.world.World;

/**
 * <p>This interface defines the tools for managing a dynamic number of {@link World}s in the {@link Game}.
 * This may be useful when you want to create worlds dynamically - as a reaction to some action.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface DynamicWorldNumberGame extends MultiworldGame {


    /**
     * <p>This method enables an possibility to add the given {@link World} instance
     * to the current game environment. This enables (at the abstract level of the game)
     * possibility to change a number of locations in the global world (macroworld,
     * game map, ...) and provides whole new game experience.</p>
     *
     * <p>It also can be used (when well designed) as an <i>custom world construction</i> mode.</p>
     *
     * @param world to be added to the {@link Game}
     */
    public void addWorld(World world);


    /**
     * <p>This method is responsible for the dynamic {@link World} removing from the game.</p>
     *
     * @param world     to be removed from the {@link Game}
     */
    public void remove(World world);
}
