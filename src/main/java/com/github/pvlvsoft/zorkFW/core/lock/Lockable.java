package com.github.pvlvsoft.zorkFW.core.lock;

/**
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-18
 */
public interface Lockable {

    /**
     * <p>This method is the core of the {@code lockable} conception. It returns the
     * {@link Lock} this instance is secured by.</p>
     *
     * @return  {@link Lock} having this instance safe.
     */
    public Lock getLock();


    /**
     * <p>This method let's anyone know, if this is or is not locked.</p>
     *
     * @return  {@code boolean} interpretation of if this instance is or is not
     *          locked by the {@link Lock}.
     */
    public boolean isLocked();
}
