package com.github.pvlvsoft.zorkFW.core;

import com.github.pvlvsoft.zorkFW.core.item.Item;

import java.util.List;


/**
 * <p>This interface defines the tools for {@link Item} management. This one is an ancestor
 * for all the item containers in the game. {@link Bag}s, {@link Room}s etc.</p>
 *
 * <p>This instances works as a collection of {@link Item}s inside. It can put new items inside,
 * return it's insides, removes them, tell the number of items inside etc.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface ItemContainer {


    /**
     * <p>The {@link ItemContainer} has to be able to return all the {@link Item}s inside.</p>
     *
     * @return {@link List} of {@link Item}s contained in this container
     */
    public List<Item> getItems();


    /**
     * <p>Basic operation of removing of the {@link Item} instance from the {@link ItemContainer}.</p>
     *
     * @param item  to be removed from the container.
     */
    public void remove(Item item);


    /**
     * <p>Adds the {@link Item} to the container.</p>
     *
     * @param item  {@link Item} to be added to the container
     */
    public void add(Item item);


    /**
     * <p>Method for adding the list of all given items to the container.</p>
     *
     * @param items     {@link List} of {@link Item}s to be added to the container
     */
    public void addAll(List<Item> items);


    /**
     * <p>This method gives back the number of {@link Item}s in the container.</p>
     *
     * @return  the {@code int}-formed size of the container.
     */
    public int getNumberOfItems();


    /**
     * <p>Removes all the {@link Item}s from the container.</p>
     */
    public void clear();
}
