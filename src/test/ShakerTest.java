package test;

import static org.junit.Assert.*;
import org.junit.Test;

        /*
        Test Shaker klassens metoder:
         1. Test om Shaker returnere en sum mellem 2 og 12.
         2. Test om Shaker returnere de enkelte terninge værdier mellem 1 og 6.
         3. Test om Shaker returnere isDouble og det passer med de tal der bliver givet.
        */

public class ShakerTest {

    // Declares object of the "Shaker" class in the folder "game".
    private game.Shaker shake = new game.Shaker();


    // Declares variables.
    private boolean getSumTestComplete = false;
    private boolean getDoubleTestComplete = false;


    @Test
    public void getSumTest() throws Exception {

        shake.Shake();
        // Checks if the sum given by the Shaker class is between 2 and 12.
        // Returns a boolean whether it works.


        if (shake.getSum() >= 2 && shake.getSum() <= 12) {
            getSumTestComplete = true;
        }
        /*
        // Checks if the 2 dice given by the Shaker class is between 1 and 6 each.
        // Returns a boolean whether it works.
        if (dice.valueDice1 >= 1 && dice.valueDice1 <= 6) { returnDie1Value = true;}
        if (dice.valueDice2 >= 1 && dice.valueDice2 <= 6) { returnDie2Value = true;}
        */

        // Checks if the booleans are true.
        assertEquals(true, getSumTestComplete);

    }
    @Test
    public void getDoubleTest() {

        shake.Shake();

        if(shake.getDouble() == true && shake.valueDice1 == shake.valueDice2) {
            getDoubleTestComplete = true;
        }

        // Checks if the booleans are true.
        assertEquals(shake.getDouble(), getDoubleTestComplete);

    }

}