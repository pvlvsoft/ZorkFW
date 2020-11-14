package com.github.pvlvsoft.zorkFW.core.player;


import com.github.pvlvsoft.zorkFW.core.Room;
import com.github.pvlvsoft.zorkFW.core.world.World;

import java.util.List;


/**
 * <p>The instance representing the player - one of the most important instances through the game.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface Player {


    /**
     * <p>Tells what world the {@link Player} is in.</p>
     *
     * @return  the {@link World} instance the {@link Player} is currently in
     */
    public World getCurrentWorld();


    /**
     * <p>Tells what {@link Room} the player currently is in.</p>
     *
     * @return  what {@link Room} the player is right now in.
     */
    public Room getCurrentRoom();


    /**
     * <p>Gives back the list of all visited rooms.</p>
     *
     * @return  {@link List} of all {@link Room} the player ever was in.
     */
    public List<Room> getVisitedRooms();


    /**
     * <p>Sets the current {@link World} instance.</p>
     *
     * @param world the player is going to be in
     */
    public void setCurrentWorld(World world);


    /**
     * <p>Sets the current {@link Room} instance.</p>
     *
     * @param room  the player is set to be in
     */
    public void setCurrentRoom(Room room);

}
