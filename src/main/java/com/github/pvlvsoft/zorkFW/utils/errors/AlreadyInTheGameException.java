package com.github.pvlvsoft.zorkFW.utils.errors;


/**
 * <p>This {@link RuntimeException} represents a hole in the consistency (is descendant
 * of the {@link GameConsistencyError}). Specially is used, when there is an instance in
 * the game and some instance tries to add it to the game again. When it can broke the game
 * consistency, this exception should be thrown.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 *
 * @see com.github.pvlvsoft.zorkFW.utils.errors.GameConsistencyError
 * @see com.github.pvlvsoft.zorkFW.core.player.Player
 * @see com.github.pvlvsoft.zorkFW.core.game
 * @see com.github.pvlvsoft.zorkFW.core.item.Item
 * @see com.github.pvlvsoft.zorkFW.core.Room
 * @see RoomIsOneWayNeighborException
 */
public class AlreadyInTheGameException extends GameConsistencyError {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/




    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/


    private static final String DEFAULT_MESSAGE = "The game identified problems with potential duplicity!";


    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/





    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/

    public AlreadyInTheGameException() {

        super(DEFAULT_MESSAGE);
    }

    public AlreadyInTheGameException(String s) {

        super(s);
    }

    public AlreadyInTheGameException(String s, Throwable throwable) {

        super(s, throwable);
    }

    public AlreadyInTheGameException(Throwable throwable) {

        super(throwable);
    }

    public AlreadyInTheGameException(String s, Throwable throwable, boolean b, boolean b1) {

        super(s, throwable, b, b1);
    }


    /* ****************************************************************************************/
    /* INSTANCE METHODS ***********************************************************************/



    /* ****************************************************************************************/
    /* STATIC METHODS *************************************************************************/




    /* ****************************************************************************************/
    /* GETTERS AND SETTERS ********************************************************************/





    /* ****************************************************************************************/
    /* AUX METHODS ****************************************************************************/





    /* ****************************************************************************************/
    /* NESTED CLASSES *************************************************************************/


}
