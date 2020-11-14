package com.github.pvlvsoft.zorkFW.core.bag;


import com.github.pvlvsoft.zorkFW.core.ItemContainer;
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
public interface WeightRestrictedBag extends CapacityRestrictedBag {


}
