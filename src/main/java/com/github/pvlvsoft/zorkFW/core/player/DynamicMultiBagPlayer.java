package com.github.pvlvsoft.zorkFW.core.player;

import com.github.pvlvsoft.zorkFW.core.bag.Bag;

/**
 * <p>This interface defines tools for dynamic player bag management. For example, the {@link Player}
 * can have more bags at the same time. He also can have different number of them during the game.</p>
 *
 * <p>This can be used for example as getting another pockets when the player wears some special clothes.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface DynamicMultiBagPlayer extends MultiBagPlayer {

    /**
     * <p>This method allows player to have more bags and dynamically add them to his property.</p>
     *
     * @param bag   {@link Bag} instance to be added to the {@link Player}'s possession
     */
    public void addBag(Bag bag);


    /**
     * <p>To be removed from the possession of the player dynamically.</p>
     *
     * @param bag   {@link Bag} instance to be removed from the {@link Player}.
     */
    public void removeBag(Bag bag);
}
