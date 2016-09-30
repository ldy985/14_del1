package spil;

import java.util.Random;

/**
 * Created by s165240 on 23-09-2016.
 */
public class Dice {
    private int faceValue;
    private Random rand = new Random();


    public Dice() {
        faceValue = rand.nextInt(6) + 1;
    }

    public void Roll() {
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
