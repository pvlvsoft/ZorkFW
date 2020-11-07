package com.github.pvlvsoft.zorkFW.core;

public interface SingleWorldGame {

    /**
     * <p>Returns the only {@link World} instance reference the {@link Game} has.</p>
     *
     * @return  the {@link World} the {@link Game} is in.
     */
    public World getWorld();
}
