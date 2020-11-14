package com.github.pvlvsoft.zorkFW.core.player;

/**
 * <p>This interface defines the responsibility of the {@link PlayerFactory} instances (classes).
 * These are used for the {@link Player} instances creation management - the constructor of the
 * player should be {@code package-private} in order to prevent unusual player creation and in
 * order to prevent some consistency errors.</p>
 *
 * <p>Using of {@code Factory} design pattern allows recycling unused instances (extension to
 * {@code Pool} design pattern), managing the creation, identifying the instances by a unique,
 * thread-safe key and so on.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 */
public interface PlayerFactory {


    /**
     * <p>This method is responsible for managing the {@link Player} instances build.</p>
     *
     * <p>It's highly recommended to set the player representing class' constructor
     * {@code package-private} or set this interface implementing in order to prevent
     * the uncontrolled instance creation from other parts of the program.</p>
     *
     * @return the {@link Player} instance.
     */
    public Player buildPlayer();
}
