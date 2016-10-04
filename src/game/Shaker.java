package game;

import java.awt.*;

/**
 * Created by timot on 03-10-2016.
 */
public class Shaker {

    //initialising variables

    private int sum;
    public int valueDice1;
    public int valueDice2;

    //Creating two objects from the dice class.

    private Dice Dice1 = new Dice();
    private Dice Dice2 = new Dice();


    //The Constructor for the Shaker class

   public Shaker() {

    }

    //Creating the shake Method returning a string with the values fot Dice1 and Dice2

    String Shake() {

        String ResultDice1 = Integer.toString(Dice1.Roll());
        String ResultDice2 = Integer.toString(Dice2.Roll());

        valueDice1 = Integer.parseInt(ResultDice1);
        valueDice2 = Integer.parseInt(ResultDice2);

        sum = valueDice1 + valueDice2;

        return "The value for the first dice is " + ResultDice1 + " and the value for the second dice is " + ResultDice2 + ".";
    }

    //Creating the method for storing the sum of the Dice values

    public int getSum() {

        return sum;
    }

    //Creating the method to evaluate the result from dice 1 and dice 2.

    public boolean getDouble() {

        if (valueDice1 == valueDice2) {
            return true;
        } else {
            return false;
        }

    }
}



