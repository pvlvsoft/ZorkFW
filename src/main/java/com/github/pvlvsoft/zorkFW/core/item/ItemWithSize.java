package com.github.pvlvsoft.zorkFW.core.item;


/**
 * <p>This kind of {@link Item} has an additional attribute - size. It's scalar (non-dimensional)
 * representation of an item size. The bigger the item is, the size value should be higher.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface ItemWithSize {


    /**
     * <p>Returns the scalar representation of the size of an item.</p>
     * @return
     */
    public float getSize();
}
