package com.github.pvlvsoft.zorkFW.core.bag;


import com.github.pvlvsoft.zorkFW.core.ItemContainer;
import com.github.pvlvsoft.zorkFW.core.player.Player;
import com.github.pvlvsoft.zorkFW.core.item.Item;

/**
 * <p>This interface provides basic tools for managing the {@link Bag}-like instances.
 * These are containers for the {@link Item}s and are used for picking some by {@link Player}
 * and let him take it out of the room.</p>
 *
 * <p>The bag may be restricted for use - while there are too many items or their sum of the
 * weight is too big, the bag won't be able to let them inside.</p>
 *
 * <p>There may be more {@link Bag} instances for the {@link Player}.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface Bag extends ItemContainer {


    /**
     * <p>This method tries, if the given {@link Item} is possible to be put to the {@link Bag}.
     * The answer is {@code boolean} interpretation of ability to take the item inside.</p>
     *
     * @param item  {@link Item} instance to be tested, if it fits in the {@link Bag} or does not.
     *
     * @return      {@code boolean}-formed result of the test - if the {@code item} is possible to be
     *              put inside or not.
     */
    public boolean doesItFit(Item item);
}
