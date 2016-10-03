package game;

import java.util.Random;

/**
 * Created by s165240 on 23-09-2016.
 */
public class Dice {
    //private int faceValue = 1;
    private Random rand = new Random();

    public int Roll() {
        return rand.nextInt(6) + 1;
    }
}
