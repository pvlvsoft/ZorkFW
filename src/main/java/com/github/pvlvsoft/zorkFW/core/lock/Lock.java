package com.github.pvlvsoft.zorkFW.core.lock;

import com.github.pvlvsoft.zorkFW.core.utils.errors.IncompatibleKeyException;
import com.github.pvlvsoft.zorkFW.core.utils.errors.KeyDoesNotWorkWithLockException;

/**
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-18
 */
public interface Lock {


    /**
     * <p>Let's you know if this lock is or is not locked.</p>
     *
     * @return  {@code boolean} interpretation of if this lock is
     *          or is not locked.
     */
    public boolean isLocked();


    /**
     * <p>This method tries to unlock the key. When the key is not correct,
     * it results in an {@link RuntimeException}.</p>
     *
     * <p>Always try to catch the possible exception.</p>
     *
     * @param key       To be tested if works while unlocking the lock.
     *
     * @throws KeyDoesNotWorkWithLockException  when cannot be unlocked using this key.
     *
     * @throws IncompatibleKeyException         when the given key is not compatible with
     *                                          this type of lock.
     */
    public void tryToUnlock(Key key) throws KeyDoesNotWorkWithLockException, IncompatibleKeyException;


    /**
     * <p>Let's you know if the key is or is not compatible. This should not reflect if this lock
     * is unlockable using the given key - just if the key is of same type of this lock needs.</p>
     *
     * <p>For example mind the difference between <b>padlock</b>, <b>door lock</b> or <b>pin based
     * lock</b>.</p>
     *
     * @param key   to be tested if is or is not compatible with this kind of key.
     *
     * @return      {@code boolean} interpretation of the {@link Key} compatibility
     */
    public boolean isCompatible(Key key);
}
