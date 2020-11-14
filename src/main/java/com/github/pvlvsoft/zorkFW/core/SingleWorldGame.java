package com.github.pvlvsoft.zorkFW.core;

public interface SingleWorldGame extends Game {

    /**
     * <p>Returns the only {@link World} instance reference this game has.</p>
     *
     * @return  the {@link World} this game is in.
     */
    public World getWorld();
}
