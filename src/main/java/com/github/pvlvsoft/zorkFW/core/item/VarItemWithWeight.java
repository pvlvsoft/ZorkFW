package com.github.pvlvsoft.zorkFW.core.item;


/**
 * <p>This type of {@link Item} is able to do the same as it's ancestor ({@link ItemWithWeight}),
 * it also provides tools for changing the weight during the game. It means the item has it's
 * weight, it can publicly share it's weight and it also can get heavier or lighter as an reaction
 * to some action.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface VarItemWithWeight extends ItemWithWeight {


    /**
     * <p>Interface of {@link VarItemWithWeight} provides this tool - setting the weight
     * dynamically - during the game.</p>
     *
     * @param weight    {@code float}-formed weight this {@link Item} should have now.
     *                  When it's a negative number, it set's the item to be not movable.
     */
    public void setWeight(float weight);


    /**
     * <p>Returns the maximum weight the {@link ItemWithWeight} may have. By default should
     * not be restricted, which means it should be equal to {@code Float.MAX_VALUE}.</p>
     *
     * @return  {@code float}-formed max value the item's weight can be set to.
     */
    public float getMaxWeight();


    /**
     * <p>Minimum weight the {@link ItemWithWeight} can have. By default it should not
     * be restricted, which means it should be equal to {@code 0}.</p>
     *
     * @return  {@code float}-formed minimum value the item's weight can be set to and
     *          stays movable.
     */
    public float getMinWeight();
}
