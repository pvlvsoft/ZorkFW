package com.github.pvlvsoft.zorkFW.core.lock;

/**
 * <p>This instance is responsible for unlocking the {@link Lockable} (i.e. {@link Lock}s).</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-18
 */
public interface Key {


    /**
     * <p>Returns the type the key is compatible with.</p>
     *
     * @return  the {@link LockType} instance this key is compatible with.
     */
    public LockType getLockType();
}
