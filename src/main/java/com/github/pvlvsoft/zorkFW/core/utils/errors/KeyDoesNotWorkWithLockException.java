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
public class KeyDoesNotWorkWithLockException extends RuntimeException {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/

    private Lock lock;
    private Key key;


    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/

    private static final String DEFAULT_MESSAGE = "The given key does not work with the given key!";


    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/





    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/

    public KeyDoesNotWorkWithLockException() {

        super(DEFAULT_MESSAGE);
    }


    public KeyDoesNotWorkWithLockException(Key key, Lock lock) {

        super(DEFAULT_MESSAGE);

        this.key = key;
        this.lock = lock;
    }

    public KeyDoesNotWorkWithLockException(String s, Key key, Lock lock) {

        super(s);

        this.key = key;
        this.lock = lock;
    }

    public KeyDoesNotWorkWithLockException(String s, Throwable throwable, Key key, Lock lock) {

        super(s, throwable);

        this.key = key;
        this.lock = lock;
    }

    public KeyDoesNotWorkWithLockException(Throwable throwable, Key key, Lock lock) {

        super(throwable);

        this.key = key;
        this.lock = lock;
    }

    public KeyDoesNotWorkWithLockException(String s, Throwable throwable, boolean b, boolean b1, Key key, Lock lock) {

        super(s, throwable, b, b1);

        this.key = key;
        this.lock = lock;
    }



    public KeyDoesNotWorkWithLockException(String s) {

        super(s);
    }

    public KeyDoesNotWorkWithLockException(String s, Throwable throwable) {

        super(s, throwable);
    }

    public KeyDoesNotWorkWithLockException(Throwable throwable) {

        super(throwable);
    }

    public KeyDoesNotWorkWithLockException(String s, Throwable throwable, boolean b, boolean b1) {

        super(s, throwable, b, b1);
    }


    /* ****************************************************************************************/
    /* INSTANCE METHODS ***********************************************************************/




    /* ****************************************************************************************/
    /* STATIC METHODS *************************************************************************/




    /* ****************************************************************************************/
    /* GETTERS AND SETTERS ********************************************************************/


    public Lock getLock() {

        return lock;
    }

    public Key getKey() {

        return key;
    }


    /* ****************************************************************************************/
    /* AUX METHODS ****************************************************************************/





    /* ****************************************************************************************/
    /* NESTED CLASSES *************************************************************************/


}
