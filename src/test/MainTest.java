package test;

import desktop_resources.GUI;
import game.Shaker;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ldy on 05-10-2016.
 */
public class MainTest {


    @org.junit.Test
    //Checks if it takes under 333 ms to roll the dice and display it.
    public void SpeedTest() {
        GUI.setDice(0, 0, 0, 0, 0, 0);

        final Shaker shaker = new Shaker();
        long startTime = System.nanoTime();

        shaker.shake();

        //Update GUI with the dice roll
        GUI.setDice(shaker.getDie1Value(), shaker.getDie2Value());

        long finishTime = System.nanoTime();

        double timeTaken = (finishTime - startTime) / 1000000.0;//ms

        System.out.println(timeTaken);

        assertEquals(true, timeTaken < 333);
    }
}