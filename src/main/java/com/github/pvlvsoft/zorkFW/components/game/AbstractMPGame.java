package com.github.pvlvsoft.zorkFW.components.game;


import com.github.pvlvsoft.zorkFW.core.game.MultiPlayerGame;
import com.github.pvlvsoft.zorkFW.core.game.MultiWorldGame;
import com.github.pvlvsoft.zorkFW.core.game.SingleWorldGame;
import com.github.pvlvsoft.zorkFW.core.player.Player;
import com.github.pvlvsoft.zorkFW.core.player.PlayerFactory;
import com.github.pvlvsoft.zorkFW.core.utils.errors.AlreadyInTheGameException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>This {@code abstract} class of Multiplayer game is a basic definition of the game container.
 * Descendants of this class should be defined as {@code Singleton}s for preventing multi-game
 * nonsense, which could lead to consistency disruption and the fatal failure of the game.</p>
 *
 * <p>This class should be used as a parent-formed template of a multiplayer game. Always try to
 * {@code override} the methods. Only reason for not overriding is using the same algorithms and
 * code formation - <b>DRY</b> principle.</p>
 *
 * <p>The abbr of the class name stands for {@code AbstractMultiPlayerGame}.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-14
 *
 * @see MultiPlayerGame
 * @see PlayerFactory
 * @see com.github.pvlvsoft.zorkFW.core.world.World
 * @see SingleWorldGame
 * @see com.github.pvlvsoft.zorkFW.core.game.SinglePlayerGame
 * @see MultiWorldGame
 */
public abstract class AbstractMPGame implements MultiPlayerGame, PlayerFactory {



    /* ****************************************************************************************/
    /* INSTANCE VARIABLES *********************************************************************/


    private final PlayerFactory playerFactory;
    private List<Player> players = new ArrayList<>();


    /* ****************************************************************************************/
    /* STATIC VARIABLES ***********************************************************************/




    /* ****************************************************************************************/
    /* STATIC INIT BLOCKS *********************************************************************/





    /* ****************************************************************************************/
    /* CONSTRUCTORS ***************************************************************************/

    protected AbstractMPGame(PlayerFactory playerFactory) {

        this.playerFactory = playerFactory;
    }


    /* ****************************************************************************************/
    /* INSTANCE METHODS ***********************************************************************/



    /**
     * <p>Returns a list of players currently in the game.</p>
     *
     * @return {@link List} of {@link Player}s the {@link MultiPlayerGame} has at the time.
     */
    @Override
    public List<Player> getPlayers() {

        return this.players;
    }

    /**
     * <p>This method allows adding the {@link Player} instance to the game.</p>
     *
     * @param player {@link Player} to be added to the game.
     * @throws AlreadyInTheGameException when there already is such a player.
     */
    @Override
    public void addPlayerToGame(Player player) throws AlreadyInTheGameException {

        this.players.add(player);
    }

    /**
     * <p>This method is responsible for the {@link Player} removing.
     * When there is no need for the player or is kicked by the game logic,
     * it can be terminated using this method.</p>
     *
     * @param player {@link Player} instance to be removed from the game.
     */
    @Override
    public void removePlayerFromGame(Player player) {

        this.players.remove(player);
    }

    /**
     * <p>This method is able to return the number of {@link Player}s in the game.</p>
     *
     * @return {@code int}-formed number of {@link Player}s in the {@link MultiPlayerGame}.
     */
    @Override
    public int getNumberOfPlayers() {

        return this.players.size();
    }

    /**
     * <p>This method clears the field of the {@link Player}s.</p>
     */
    @Override
    public void clearPlayers() {

        this.players = new ArrayList<>();
    }


    /**
     * <p>This method is responsible for managing the {@link Player} instances build.</p>
     *
     * <p>It's highly recommended to set the player representing class' constructor
     * {@code package-private} or set this interface implementing in order to prevent
     * the uncontrolled instance creation from other parts of the program.</p>
     *
     * @return the {@link Player} instance.
     */
    @Override
    public Player buildPlayer() {

        Player p = this.playerFactory.buildPlayer();
        this.players.add(p);

        return p;
    }


    /* ****************************************************************************************/
    /* STATIC METHODS *************************************************************************/




    /* ****************************************************************************************/
    /* GETTERS AND SETTERS ********************************************************************/





    /* ****************************************************************************************/
    /* AUX METHODS ****************************************************************************/





    /* ****************************************************************************************/
    /* NESTED CLASSES *************************************************************************/


}
