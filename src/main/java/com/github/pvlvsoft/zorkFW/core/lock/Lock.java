package com.github.pvlvsoft.zorkFW.core.lock;

import com.github.pvlvsoft.zorkFW.core.Room;
import com.github.pvlvsoft.zorkFW.core.utils.errors.IncompatibleKeyException;
import com.github.pvlvsoft.zorkFW.core.utils.errors.KeyDoesNotWorkWithLockException;

/**
 * <p>This class defines the {@link Lock} as an instance having it's own type, state (locked/unlocked)
 * and a set of tools for using it.</p>
 *
 * <p>Every instance of {@link Lockable} (this may be {@link Room} for example) has to have it's own
 * {@link Lock} instance (because of {@link Lockable#getLock()}) - when it also implements the Lockable
 * interface of course.</p>
 *
 * <p>For unlocking the lock, you need a corresponding {@link Key} instance (same {@link LockType} as the lock)
 * and with corresponding value - there may be many various implementations.</p>
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
     * <p>This method allows the player to lock the {@link Lockable} instance. When the key is not correct,
     * it results in an {@link RuntimeException}.</p>
     *
     * <p>Always try to catch the possible exception.</p>
     *
     * @param key       To be tested if works while unlocking the lock.
     *
     * @throws KeyDoesNotWorkWithLockException  when cannot be locked using this key.
     *
     * @throws IncompatibleKeyException         when the given key is not compatible with
     *                                          this type of lock.
     */
    public void tryToLock(Key key) throws KeyDoesNotWorkWithLockException, IncompatibleKeyException;



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


    /**
     * <p>This method is responsible for letting others know what type of lock this one is.</p>
     *
     * @return  {@link LockType} this lock is and what type of {@link Key} do you need.
     */
    public LockType getLockType();
}
