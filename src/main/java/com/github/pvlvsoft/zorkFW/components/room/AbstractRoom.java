package com.github.pvlvsoft.zorkFW.components.room;


import com.github.pvlvsoft.zorkFW.core.Room;
import com.github.pvlvsoft.zorkFW.core.item.Item;
import com.github.pvlvsoft.zorkFW.core.player.Player;
import org.example.identify.instances.Named;
import org.example.identify.instances.Recognisable;
import org.example.identify.recognizers.RecognitionInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>This {@code abstract} class is representing a basic {@link Room} definition. It's implementing
 * the interface of {@link Room} to have a callable functions, such as neighbor management.</p>
 *
 * <p>This class does not have {@link Item}s management and {@link Player}s management implemented.
 * The reason is basically because the implementor should decide how the items addition (and removing)
 * will be done, but it's strictly recommended to be done with check of uniqueness of the elements.</p>
 *
 * <p>Similarly, the player management depends on if the implementor decides to create the game as
 * {@link com.github.pvlvsoft.zorkFW.core.game.MultiPlayerGame} version or the
 * {@link com.github.pvlvsoft.zorkFW.core.game.SinglePlayerGame} version. This defines the further
 * means of the game and further intentions. Implementation of these tools inside this class should
 * not restrict the usability of this instances.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-18
 */
public abstract class AbstractRoom implements Room, Named {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/

    private List<Room> neighbors = new ArrayList<>();

    private String name;


    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/

    private volatile static long ID = 0L;


    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/




    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/



    public AbstractRoom() {

        synchronized (AbstractRoom.class) {

            name = String.valueOf(++ID);
        }
    }


    public AbstractRoom(String name) {

        this.name = name;
    }


    public AbstractRoom(String name, Room... rooms) {

        this.name = name;

        for (Room neighbor : rooms) {

            this.addNeighbor(neighbor);
        }
    }

    public AbstractRoom(String name, List<Room> neighbors) {

        this.name = name;

        for (Room neighbor : neighbors) {

            this.addNeighbor(neighbor);
        }
    }


    /* ****************************************************************************************/
    /* INSTANCE METHODS ***********************************************************************/


    /**
     * <p>Adds {@link Room} to the list of neighbors. It means the given room is gonna
     * be "next to this one".</p>
     *
     * <p>Take care of checking, if it is not already contained. If it is not checked,
     * it may lead to {@link StackOverflowError}.</p>
     *
     * @param room to be added as a neighbor
     */
    @Override
    public void addNeighbor(Room room) {

        if(!this.isNeighbor(room)) {

            this.addNeighbor(room);
            room.addNeighbor(this);
        }
    }

    /**
     * <p>Removes the given {@link Room} of the list of neighbors. It means the given
     * room won't be "next to this one" anymore.</p>
     *
     * @param room to be removed from the list of neighbors
     */
    @Override
    public void removeNeighbor(Room room) {

        this.neighbors.remove(room);
    }


    @Override
    public boolean hasSameName(Named named) {

        return this.name.equals(named.getName());
    }

    @Override
    public boolean hasName(String s) {

        return this.getName().equals(s);
    }


    @Override
    public boolean corresponds(Recognisable recognisable) {

        if(recognisable instanceof Named) {

            return this.hasName(((Named) recognisable).getName());
        }

        return false;
    }


    /**
     * <p>Returns the basic {@code boolean}-formed information
     * about if this place has any neighbors. This may be useful
     * mostly for debugging, testing and validating consistency.</p>
     *
     * @return boolean information about if this place has any neighbors.
     */
    @Override
    public boolean hasNeighbors() {

        return this.neighbors.size() > 0;
    }



    /* ****************************************************************************************/
    /* STATIC METHODS *************************************************************************/




    /* ****************************************************************************************/
    /* GETTERS AND SETTERS ********************************************************************/



    /**
     * <p>Returns {@code boolean}-formed information if is or is not the
     * given room neighbor room of this place.</p>
     *
     * @param room to be checked if is or is not a neighbor.
     * @return if {@code room} is or is not a neighbor to this room.
     */
    @Override
    public boolean isNeighbor(Room room) {

        return this.neighbors.contains(room);
    }


    /**
     * <p>Returns number of neighbors of this place.</p>
     *
     * @return {@code int} formed number of the neighbors.
     */
    @Override
    public int getNumberOfNeighbors() {

        return this.neighbors.size();
    }


    @Override
    public boolean isUniqueIdentifier() {

        return false;
    }

    @Override
    public RecognitionInstrument getInstrument() {

        throw new RuntimeException("Not implemented!");
    }


    /**
     * <p>Returns neighbors of this room. They are formatted
     * as a list for easier use.</p>
     *
     * @return the {@link List} of all neighbors of this room
     * - where is possible to go from here.
     */
    @Override
    public List<Room> getNeighbors() {

        return this.neighbors;
    }


    @Override
    public String getName() {

        return this.name;
    }


    /* ****************************************************************************************/
    /* AUX METHODS ****************************************************************************/





    /* ****************************************************************************************/
    /* NESTED CLASSES *************************************************************************/


}
