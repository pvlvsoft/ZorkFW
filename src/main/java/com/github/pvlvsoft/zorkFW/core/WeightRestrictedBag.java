package com.github.pvlvsoft.zorkFW.core;


import com.github.pvlvsoft.zorkFW.core.item.Item;

/**
 * <p>This type {@link Bag} bag provides tools of managing of movable {@link ItemContainer}
 * with restriction of the items in the bag. When the player tries to put inside an
 * {@link Item} that it too weighty, the {@link Bag} refuses it. It does not matter
 * how many items are inside.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface WeightRestrictedBag extends Bag {


    /**
     * <p>The {@link Bag} has weight restriction. It represent how much is the {@link Player}
     * able to bear in the {@link Bag}. This method returns the rest space (weight) it can
     * hold inside.</p>
     *
     * @return  {@code float}-formed free capacity of the {@link Bag} - the space (weight)
     *          the {@link Player} can fill in with {@link Item}s
     */
    public float getFreeCapacity();


    /**
     * <p>The {@link Bag} has weight restriction. It represent how much is the {@link Player}
     * able to bear in the {@link Bag}. This method returns the total space (weight) it can
     * hold inside.</p>
     *
     * @return  {@code float}-formed total capacity of the {@link Bag} - the space (weight)
     *          the {@link Player} can fill in with {@link Item}s
     */
    public float getTotalCapacity();
}
