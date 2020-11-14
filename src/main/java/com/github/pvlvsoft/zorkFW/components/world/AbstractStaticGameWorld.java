package com.github.pvlvsoft.zorkFW.components.world;


import com.github.pvlvsoft.zorkFW.core.Room;
import com.github.pvlvsoft.zorkFW.core.player.Player;
import com.github.pvlvsoft.zorkFW.core.world.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p></p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public abstract class AbstractStaticGameWorld implements World {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/


    private List<Room> rooms = new ArrayList<>();
    private Room defaultRoom = null;


    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/




    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/





    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/


    private AbstractStaticGameWorld() {}


    protected AbstractStaticGameWorld(Room... rooms) {

        this(0, rooms);
    }

    protected AbstractStaticGameWorld(int index, Room... rooms) {

        if(index < rooms.length) {

            this.rooms.addAll(Arrays.asList(rooms));
            this.defaultRoom = this.rooms.get(index);

        } else {

            throw new IllegalArgumentException(
                    "The given index is greater than the number of rooms given!"
                    + index
            );
        }
    }


    /* ****************************************************************************************/
    /* INSTANCE METHODS ***********************************************************************/

    /**
     * <p>Returns all the rooms in this world. These rooms are formatted as an {@link List}
     * instance for easier use. It also allows their change during the game play.</p>
     *
     * @return all rooms this world contains.
     */
    @Override
    public List<Room> getRooms() {

        return this.rooms;
    }

    /**
     * <p>Returns the default {@link Room} the player is going to be in when he enters the {@link World}.</p>
     *
     * @return {@link Room} the {@link Player} gets to when he enters this {@link World}.
     */
    @Override
    public Room getDefaultRoom() {

        return this.defaultRoom;
    }


    /* ****************************************************************************************/
    /* STATIC METHODS *************************************************************************/




    /* ****************************************************************************************/
    /* GETTERS AND SETTERS ********************************************************************/





    /* ****************************************************************************************/
    /* AUX METHODS ****************************************************************************/





    /* ****************************************************************************************/
    /* NESTED CLASSES *************************************************************************/


}
