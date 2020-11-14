package com.github.pvlvsoft.zorkFW.core.player;

import com.github.pvlvsoft.zorkFW.core.ItemContainer;
import com.github.pvlvsoft.zorkFW.core.bag.Bag;
import com.github.pvlvsoft.zorkFW.core.item.Item;

import java.util.List;

/**
 * <p>This interface defines the base tools for the {@link Player} using it's {@link Bag}
 * as an {@link ItemContainer}.</p>
 *
 * <p>The base is designed to be compatible with {@link SingleBagPlayer} and
 * {@link MultiBagPlayer} instances.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface PlayerWithBag extends Player {


    /**
     * <p>Adds the given {@link Item} to the {@link Player}'s bag.</p>
     *
     * @param item  to be added to a bag of the player
     */
    public void addItem(Item item);


    /**
     * <p>Removes the given {@link Item} from the {@link Player}'s bag.</p>
     *
     * @param item  to be removed from the player's bag.
     */
    public void remove(Item item);


    /**
     * <p>This method returns all the {@link Item}s the player has in all the {@link Bag}s.</p>
     *
     * @return  all the items the player has.
     */
    public List<Item> getAllFromBags();
}
