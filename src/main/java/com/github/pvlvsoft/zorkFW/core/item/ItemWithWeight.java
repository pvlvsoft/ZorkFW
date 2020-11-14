package com.github.pvlvsoft.zorkFW.core.item;

import com.github.pvlvsoft.zorkFW.core.bag.WeightRestrictedBag;

public interface ItemWithWeight extends Item {


    /**
     * <p>Returns weight of this {@link Item}. It's used mostly by {@link WeightRestrictedBag},
     * when it has to be able tell if the item with such a weight can be stored inside.</p>
     *
     * @return  {@code float}-formed weight of the item.
     */
    public float getWeight();
}
