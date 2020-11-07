package com.github.pvlvsoft.zorkFW.core;

import java.util.List;

public interface Room extends ItemContainer {


    /**
     * <p>Returns neighbors of this room. They are formatted
     * as a list for easier use.</p>
     *
     * @return  the {@link List} of all neighbors of this room
     *          - where is possible to go from here.
     */
    public List<Room> getNeighbors();



    /**
     * <p>Returns number of neighbors of this place.</p>
     *
     * @return  {@code int} formed number of the neighbors.
     */
    public int getNumberOfNeighbors();



    /**
     * <p>Returns the basic {@code boolean}-formed information
     * about if this place has any neighbors. This may be useful
     * mostly for debugging, testing and validating consistency.</p>
     *
     * @return  boolean information about if this place has any neighbors.
     */
    public boolean hasNeighbors();



    /**
     * <p>Returns {@code boolean}-formed information if is or is not the
     * given room neighbor room of this place.</p>
     *
     * @param room      to be checked if is or is not a neighbor.
     *
     * @return          if {@code room} is or is not a neighbor to this room.
     */
    public boolean isNeighbor(Room room);


    /**
     * <p>Lets the give player to enter the room.</p>
     *
     * @param player    {@link Player} instance to be able to enter this {@link Room}.
     */
    public void addPlayer(Player player);



    /**
     * <p>Removes the given player from the room.</p>
     *
     * @param player    {@link Player} to be removed from the {@link Room}
     */
    public void removePlayer(Player player);



    /**
     * <p>Gives you information about if the player is or is not in the room.</p>
     *
     * <p>This method is similar to the {@link Room#isPlayerInside()}.</p>
     *
     * @param player    {@link Player} to be checked if is or is not in the room
     *
     * @return          {@code true} if the player is in the room. Otherwise it returns {@code false}.
     */
    public boolean isPlayerInside(Player player);



    /**
     * <p>Gives you information about if any player is inside the room.</p>
     *
     * <p>This method is similar to the {@link Room#isPlayerInside(Player)}.</p>
     *
     * @return  {@code true} when there is a player only. Otherwise it returns {@code false}.
     */
    public boolean isPlayerInside();
}
