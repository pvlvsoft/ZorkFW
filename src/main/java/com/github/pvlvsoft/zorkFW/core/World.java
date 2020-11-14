package com.github.pvlvsoft.zorkFW.core;


import com.github.pvlvsoft.zorkFW.core.player.Player;

import java.util.List;


/**
 * <p>This interface defines the base of the world the {@link Player} tries to go through.</p>
 *
 * <p></p>
 *
 * @version 2020-11-06
 * @author Vojtech Pavlu
 */
public interface World {


    /**
     * <p>Returns all the rooms in this world. These rooms are formatted as an {@link List}
     * instance for easier use. It also allows their change during the game play.</p>
     *
     * @return  all rooms this world contains.
     */
    public List<Room> getRooms();


    /**
     * <p>Returns the default {@link Room} the player is going to be in when he enters the {@link World}.</p>
     *
     * @return  {@link Room} the {@link Player} gets to when he enters this {@link World}.
     */
    public Room getDefaultRoom();
}
