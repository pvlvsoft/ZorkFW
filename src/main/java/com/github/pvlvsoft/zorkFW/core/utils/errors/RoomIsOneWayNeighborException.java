package com.github.pvlvsoft.zorkFW.core.utils.errors;


import com.github.pvlvsoft.zorkFW.core.Room;

/**
 * <p>This {@link RuntimeException} is an error thrown when the game indicates there is
 * a combination of two rooms, while one registers another as a neighbor, while the other one
 * doesn't.</p>
 *
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public class RoomIsOneWayNeighborException extends GameConsistencyError {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/


    private Room room1;
    private Room room2;


    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/

    private static final String DEFAULT_MESSAGE = "One of the rooms is registered as a one way neighbor!";


    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/




    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/



    public RoomIsOneWayNeighborException(Room room1, Room room2) {

        super(DEFAULT_MESSAGE);

        this.room1 = room1;
        this.room2 = room2;
    }


    public RoomIsOneWayNeighborException(String s, Room room1, Room room2) {

        super(s);

        this.room1 = room1;
        this.room2 = room2;
    }

    public RoomIsOneWayNeighborException(String s, Throwable throwable, Room room1, Room room2) {

        super(s, throwable);

        this.room1 = room1;
        this.room2 = room2;
    }

    public RoomIsOneWayNeighborException(Throwable throwable, Room room1, Room room2) {

        super(throwable);

        this.room1 = room1;
        this.room2 = room2;
    }

    public RoomIsOneWayNeighborException(String s,
                                         Throwable throwable,
                                         boolean b,
                                         boolean b1,
                                         Room room1,
                                         Room room2) {

        super(s, throwable, b, b1);

        this.room1 = room1;
        this.room2 = room2;
    }


    /* ****************************************************************************************/
    /* INSTANCE METHODS ***********************************************************************/




    /* ****************************************************************************************/
    /* STATIC METHODS *************************************************************************/




    /* ****************************************************************************************/
    /* GETTERS AND SETTERS ********************************************************************/


    /**
     * <p>Returns an array of two rooms. At least, one of them is a <i>one way neighbor</i>.</p>
     *
     * @return  an array of two {@link Room}, while at least one of them is a one way neighbor.
     */
    public Room[] getRooms() {

        return new Room[]{room1, room2};
    }


    /* ****************************************************************************************/
    /* AUX METHODS ****************************************************************************/





    /* ****************************************************************************************/
    /* NESTED CLASSES *************************************************************************/


}
