package com.github.pvlvsoft.zorkFW.core;


/**
 * <p>This interface defines the basic {@code Game} environment.</p>
 *
 * <p><b>All the classes implementing this interface should be set
 * by design as {@code Singletons}.</b></p>
 *
 * <p>This interface is hidden to general usage. That's because it
 * should be used just to specify basic {@code bridge} ancestor for
 * others. The extending interface to use is (for example) {@link MultiworldGame}.</p>
 *
 * @version 2020-11-5
 * @author Vojtech Pavlu
 */
interface Game {


    /**
     * <p>Returns meta-information (represented by {@link MetaInfo} instance) about the game.</p>
     *
     * @return the basic meta information about this game.
     */
    public MetaInfo getMetaInfo();
}
