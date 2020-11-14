package com.github.pvlvsoft.zorkFW.core.bag;

import com.github.pvlvsoft.zorkFW.core.item.Item;

public interface NumberOfItemsRestrictedBag extends RestrictedBag {

    /**
     * <p>Returns back the information about how many {@link Item}s this {@link Bag}
     * can hold inside. More than this won't be able to handle.</p>
     *
     * @return      {@code int}-formed maximum number of {@link Item}s the
     *              {@link RestrictedBag} can hold inside
     */
    public int getMaxNumberOfItems();


    /**
     * <p>This {@link RestrictedBag} is restricted by the number of {@link Item}s it
     * can hold inside. This method lets you know how many items can be stuffed inside.</p>
     *
     * @return      {@code int}-formed maximum number of {@link Item}s the {@link Bag}
     *              is able to hold right now
     */
    public int getFreeSpace();


    /**
     * <p>This {@link RestrictedBag} is restricted by the number of {@link Item}s it
     * can hold inside. This method lets you know how many items is stuffed inside now.</p>
     *
     * @return      {@code int}-formed maximum number of {@link Item}s the {@link Bag}
     *              holds now
     */
    public int getUsedSpace();
}
