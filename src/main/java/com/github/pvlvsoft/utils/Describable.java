package com.github.pvlvsoft.zorkFW.utils;


/**
 * <p>This interface defines all the needed tools for setting the entity as describable.
 * It means the instance has an interface to publicly provide it's own {@link String}-formed
 * description in natural language for further usage.</p>
 *
 * @version 2020-11-07
 * @author Vojtech Pavlu
 */
public interface Describable {


    /**
     * <p>This method provides functionality of ability to be described and defined in natural language.</p>
     *
     * @return  {@link String}-formed description of the instance.
     */
    public String getDescription();
}
