package com.github.pvlvsoft.zorkFW.core.lock;

/**
 * <p>This enumeration contains the basic lock types.</p>
 *
 * <p>These are basic and general real-world examples and may be too general for in the game,
 * for others may be the easiest way of the implementation.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-19
 */
public enum DefaultLockType implements LockType {

    PADLOCK ("Padlock"),
    DOOR_LOCK ("Door lock"),
    PIN_LOCK ("Pin-based lock"),
    PASSWORD_LOCK ("Password-based lock");


    private String lockType;


    DefaultLockType(String lockType) {

        this.lockType = lockType;
    }

    /**
     * <p>This method is responsible for returning the {@link String}-formed
     * lock type representation.</p>
     *
     * @return the {@link String}-formed {@link Lock} type representation.
     */
    @Override
    public String getLockType() {

        return this.lockType;
    }
}
