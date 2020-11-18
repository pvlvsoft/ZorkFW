package com.github.pvlvsoft.zorkFW.core.utils.errors;


import com.github.pvlvsoft.zorkFW.core.lock.Key;
import com.github.pvlvsoft.zorkFW.core.lock.Lock;

/**
 * <p></p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-18
 */
public class IncompatibleKeyException extends KeyDoesNotWorkWithLockException {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/




    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/

    private static final String DEFAULT_MESSAGE = "The given key is not compatible with the given lock!";


    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/





    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/

    public IncompatibleKeyException() {

        super(DEFAULT_MESSAGE);
    }

    public IncompatibleKeyException(Key key, Lock lock) {
        super(key, lock);
    }

    public IncompatibleKeyException(String s, Key key, Lock lock) {
        super(s, key, lock);
    }

    public IncompatibleKeyException(String s, Throwable throwable, Key key, Lock lock) {
        super(s, throwable, key, lock);
    }

    public IncompatibleKeyException(Throwable throwable, Key key, Lock lock) {
        super(throwable, key, lock);
    }

    public IncompatibleKeyException(String s, Throwable throwable, boolean b, boolean b1, Key key, Lock lock) {
        super(s, throwable, b, b1, key, lock);
    }

    public IncompatibleKeyException(String s) {
        super(s);
    }

    public IncompatibleKeyException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public IncompatibleKeyException(Throwable throwable) {
        super(throwable);
    }

    public IncompatibleKeyException(String s, Throwable throwable, boolean b, boolean b1) {
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
