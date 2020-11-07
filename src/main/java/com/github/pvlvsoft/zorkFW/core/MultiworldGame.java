package com.github.pvlvsoft.zorkFW.core;

import java.util.List;

/**
 * <p>This interface defines basic methods for <b>Multi-world</b> game base.</p>
 *
 * <p>Multiworld game enables using more worlds at once - for example it is possible to
 * use the {@link World} instances as various levels, as different cities, location etc.</p>
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface MultiworldGame extends Game {

    /**
     * <p>The other way of managing the game locations to {@link SingleWorldGame#getWorld()}.
     * This one provides returning <b>all</b> the worlds in the game, while the {@link SingleWorldGame}
     * accepts the one {@link World} only.</p>
     *
     * @return  {@link List} of all the {@link World}s in the {@link MultiworldGame}.
     */
    public List<World> getWorlds();


    /**
     * <p>This method provides the ability to search the willed {@link World} by it's name.</p>
     *
     * <p>This method may be the invoker of the {@link NullPointerException} - when the
     * {@link World} with such a name is not found, it has to return {@code null}.</p>
     *
     * @param name  of the {@link World} that should be found
     *
     * @return      {@link World} with such a name as given
     */
    public World getWorld(String name);
}
