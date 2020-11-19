package com.github.pvlvsoft.zorkFW.core.lock;

/**
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-19
 */
public interface LockType {


    /**
     * <p>This method is responsible for returning the {@link String}-formed
     * lock type representation.</p>
     *
     * @return  the {@link String}-formed {@link Lock} type representation.
     */
    public String getLockType();
}
