package com.github.pvlvsoft.zorkFW.core.bag;

import com.github.pvlvsoft.zorkFW.core.item.Item;


/**
 * <p>This interface is good for defining the base method of the {@link Bag} under restriction.
 * It means the bag has some capacity - represented by it's weight or size. The bag cannot be
 * overloaded by the {@link Item}s.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface CapacityRestrictedBag extends RestrictedBag {

    /**
     * <p>The {@link Bag} is restricted. This method returns the left space - the space
     * free to use for the player.</p>
     *
     * @return  {@code float}-formed free space.
     */
    public float getFreeCapacity();


    /**
     * <p>The {@link Bag} is restricted and has to be able to give back the total
     * capacity it has. That's what is this method good for.</p>
     *
     * @return  {@code float}-formed total capacity of the {@link Bag}.
     */
    public float getTotalCapacity();


    /**
     * <p>The {@link Bag} has it's limits defined by the restriction. That's why
     * this method can return useful data - how much is used.</p>
     *
     * @return  {@code float}-formed used capacity of the {@link Bag}
     */
    public float getUsedCapacity();
}
