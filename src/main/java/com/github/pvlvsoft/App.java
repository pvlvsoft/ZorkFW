package com.github.pvlvsoft;

import com.github.pvlvsoft.zorkFW.testImpl.Pocket;
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

        Pocket pocket = new Pocket();
        pocket.add(t1);
        pocket.add(t2);
        pocket.add(t3);
        pocket.add(t4);
        pocket.add(t5);

        System.out.println(pocket);
        System.out.println(pocket.getFreeCapacity());
    }
}
