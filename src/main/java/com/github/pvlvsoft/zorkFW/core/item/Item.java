package com.github.pvlvsoft.zorkFW.core.item;



import com.github.pvlvsoft.zorkFW.core.Bag;


/**
 * <p>This interface is the most general description of an item. It represent anything the player
 * is able to manipulate with (depends on it's mobility).</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface Item {


    /**
     * <p>Checks if this item is able to be added to a {@link Bag} instance.</p>
     *
     * @return  true when this item is possible to be moved.
     */
    public boolean isMovable();
}
