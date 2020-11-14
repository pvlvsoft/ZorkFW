package com.github.pvlvsoft.zorkFW.core.player;

import com.github.pvlvsoft.zorkFW.core.bag.Bag;

import java.util.List;

/**
 * <p>This interface allows to define access to the multi-bag player - {@link Player}. This level
 * of abstraction allows implementor to choose if the {@link Player} may have more {@link Bag}s
 * (some kind pockets, bags for special use and so on).</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface MultiBagPlayer extends PlayerWithBag {


    /**
     * <p>This method returns a list of all {@link Bag}s the {@link Player} instance has.</p>
     *
     * @return {@link List} made of {@link Bag}s the {@link Player} has.
     */
    public List<Bag> getAllBags();
}
