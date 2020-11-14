package com.github.pvlvsoft.zorkFW.core.player;

import com.github.pvlvsoft.zorkFW.core.bag.Bag;

/**
 * <p>This interface is restricting the {@link Player} instances to have only one {@link Bag}.
 * Only this way it can be provided to have these methods <b>and</b> be able to let the player
 * has more pockets at the same time.</p>
 *
 * <p>Alternatively the implementor can use the {@link MultiBagPlayer} interface to provide
 * some similar functionality but using more bags for one player at the same time.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 *
 * @see Player
 * @see MultiBagPlayer
 * @see Bag
 */
public interface SingleBagPlayer extends PlayerWithBag {

    /**
     * <p>Returns the bag the player has.</p>
     *
     * @return  the only {@link Bag} the {@link Player} has.
     */
    public Bag getBag();
}
