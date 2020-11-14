package com.github.pvlvsoft;

import com.github.pvlvsoft.zorkFW.core.controls.Action;
import com.github.pvlvsoft.zorkFW.core.item.Item;
import com.github.pvlvsoft.zorkFW.testImpl.FindTheWaldo;
import com.github.pvlvsoft.zorkFW.testImpl.Pocket;
import com.github.pvlvsoft.zorkFW.testImpl.TimThePlayer;
import com.github.pvlvsoft.zorkFW.testImpl.actions.MoveAction;
import com.github.pvlvsoft.zorkFW.testImpl.actions.PickUpAction;
import com.github.pvlvsoft.zorkFW.testImpl.items.Thing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Thing t5 = new Thing(0.45f, "T5");
        Thing t4 = new Thing(0.32f, "T4");
        Thing t3 = new Thing(0.10f, "T3");
        Thing t2 = new Thing(2.76f, "T2");
        Thing t1 = new Thing(1.978f, "T1");

        TimThePlayer player = new TimThePlayer();


        player.addItem(t1);
        player.addItem(t2);
        player.addItem(t3);
        player.addItem(t4);
        player.addItem(t5);

        Action a = new MoveAction(player, player.getCurrentWorld().getRooms().get(1));
        a.execute();

        Thing chleba = null;

        for (Item i : player.getCurrentRoom().getItems()) {

            Thing t = (Thing) i;

            if(t.getName().toLowerCase().equals("chleba")) {

                chleba = t;
            }
        }

        if(chleba != null) {

            Action pick = new PickUpAction(player, chleba);
            pick.execute();
        }


        a = new MoveAction(player, player.getCurrentWorld().getRooms().get(0));
        a.execute();



    }
}
