package com.github.pvlvsoft.zorkFW.core.item;


/**
 * <p>This type of {@link Item} is able to do the same as it's ancestor ({@link ItemWithSize}),
 * it also provides tools for changing the size during the game. It means the item has it's
 * size, it can publicly share it's size and it also can get bigger or smaller as an reaction
 * to some action.</p>
 *
 * <p>As for it's ancestor - the size is represented as a scalar (non-dimensionally). It means,
 * the bigger the {@link Item} ({@link ItemWithSize}) is, the higher the size representing
 * number should be. The number is {@code float}-formed.</p>
 *
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface VarItemWithSize extends ItemWithSize {


    /**
     * <p>Interface of {@link VarItemWithSize} provides this tool - setting the size
     * dynamically - during the game.</p>
     *
     * @param size    {@code float}-formed size this {@link Item} should have now.
     */
    public void setSize(float size);


    /**
     * <p>Returns the maximum size the {@link ItemWithSize} may have. By default, it should
     * not be restricted, which means it should be equal to {@code Float.MAX_VALUE}.</p>
     *
     * @return  {@code float}-formed max value the item's size can be set to.
     */
    public float getMaxSize();


    /**
     * <p>Minimum size the {@link ItemWithSize} can have. By default, it should not
     * be restricted, which means it should be equal to {@code 0}.</p>
     *
     * @return  {@code float}-formed minimum value the item's size can be set to.
     */
    public float getMinSize();
}