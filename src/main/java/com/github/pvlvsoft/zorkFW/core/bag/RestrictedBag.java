package com.github.pvlvsoft.zorkFW.core.bag;

import com.github.pvlvsoft.zorkFW.core.item.Item;


/**
 * <p>This {@link Bag} sets the default tools of restricted bag.</p>
 */
public interface RestrictedBag extends Bag {


    /**
     * <p>This method returns the ratio of used and total
     * space of the bag.</p>
     *
     * @return  {@code float}-formed ratio of the
     *          {@link Bag} usage by the {@link Item}s
     */
    public float getSpaceUsage();


    /**
     * <p>This method returns the usage of the {@link Bag} by the
     * {@link Item}s inside. This value is rounded by the given
     * restriction and passed as a {@link String} in the percentage
     * form.</p>
     *
     * @param numberOfDecimals  the number of decimals that should
     *                          be the final percent number rounded to
     *
     * @return                  rounded value representing the ratio of
     *                          usage of the bag in the percentage format
     */
    public String getSpaceUsage(int numberOfDecimals);
}
