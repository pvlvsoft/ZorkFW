package com.github.pvlvsoft.zorkFW.core.item;


/**
 * <p>This interface provides method of {@link DynamicMobilityItem#setMobility(boolean)} (boolean)}, which
 * has potential to set the mobility of the {@link Item} while the game is running (as a reaction
 * to some action, for example).</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface DynamicMobilityItem extends Item {

    /**
     * <p>This method provides dynamic management of the item mobility.</p>
     *
     * @param mobility  mobility of the {@link Item} represented
     *                  by the given {@code boolean} value
     */
    public void setMobility(boolean mobility);
}
