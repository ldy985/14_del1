package test;

import static org.junit.Assert.*;

import org.junit.Test;

// Tests the Shaker class
public class ShakerTest {

    // Declares object of the "Shaker" class in the folder "game".
    private game.Shaker shake = new game.Shaker();

    private game.Dice dice1 = new game.Dice();
    private game.Dice dice2 = new game.Dice();


    // Declares variables.
    private boolean getSumTestComplete = false;
    private boolean getDoubleTestComplete = false;

    @Test
    public void probTest1(){
        int value;

        int to = 0;
        int tre = 0;
        int fire = 0;
        int fem = 0;
        int seks = 0;
        int syv = 0;
        int otte = 0;
        int ni = 0;
        int ti = 0;
        int elleve = 0;
        int tolv = 0;
        int forkertnr = 0;

        // Rolling the dice 1000 times.
        // Counts the values a specific value has been rolled.

        for (int i = 0; i < 1000; i++) {

            shake.shake();

            value = shake.getSum();

            switch (value) {
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;
                case 7:
                    syv++;
                    break;
                case 8:
                    otte++;
                    break;
                case 9:
                    ni++;
                    break;
                case 10:
                    ti++;
                    break;
                case 11:
                    elleve++;
                    break;
                case 12:
                    tolv++;
                    break;
                default:
                    forkertnr++;
                    break;
            }

        }

        // Tests the program.
        // Checks if all values, of the dice (2-12), has been rolled and equal amount of times (1000/12000)
        // with a deviation of 76 times.
        assertEquals(0, forkertnr);
        assertEquals(28, to, 76);
        assertEquals(56, tre, 76);
        assertEquals(83, fire, 76);
        assertEquals(111, fem, 76);
        assertEquals(139, seks, 76);
        assertEquals(167, syv, 76);
        assertEquals(139, otte, 76);
        assertEquals(111, ni, 76);
        assertEquals(83, ti, 76);
        assertEquals(56, elleve, 76);
        assertEquals(28, tolv, 76);

    }

    @Test
    public void probTest2(){
        int value;

        int to = 0;
        int tre = 0;
        int fire = 0;
        int fem = 0;
        int seks = 0;
        int syv = 0;
        int otte = 0;
        int ni = 0;
        int ti = 0;
        int elleve = 0;
        int tolv = 0;
        int forkertnr = 0;

        // Rolling the dice 1000 times.
        // Counts the values a specific value has been rolled.

        for (int i = 0; i < 1000; i++) {

            shake.shake();

            value = shake.getSum();

            switch (value) {
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;
                case 7:
                    syv++;
                    break;
                case 8:
                    otte++;
                    break;
                case 9:
                    ni++;
                    break;
                case 10:
                    ti++;
                    break;
                case 11:
                    elleve++;
                    break;
                case 12:
                    tolv++;
                    break;
                default:
                    forkertnr++;
                    break;
            }

        }

        // Tests the program.
        // Checks if all values, of the dice (2-12), has been rolled and equal amount of times (1000/12000)
        // with a deviation of 593 times.
        assertEquals(0, forkertnr);
        assertEquals(28, to, 593);
        assertEquals(56, tre, 593);
        assertEquals(83, fire, 593);
        assertEquals(111, fem, 593);
        assertEquals(139, seks, 593);
        assertEquals(167, syv, 593);
        assertEquals(139, otte, 593);
        assertEquals(111, ni, 593);
        assertEquals(83, ti, 593);
        assertEquals(56, elleve, 593);
        assertEquals(28, tolv, 593);

    }

    // Tests if the getSum() method works in the Shaker class
    @Test
    public void getSumTest() throws Exception {

        // Calls the shake() method in the class Shaker, through the object "shake".
        shake.shake();

        // Checks if the sum given by the Shaker class is between 2 and 12.
        // Returns a boolean whether it works.
        if (shake.getSum() >= 2 && shake.getSum() <= 12) {

            getSumTestComplete = true;
        }


        // Checks if the booleans are true.
        assertEquals(true, getSumTestComplete);

    }



    // Tests if the getDouble() method works in the Shaker class.
    @Test
    public void getDoubleTest() {

        // Calls the shake() method in the class Shaker, through the object "shake".
        shake.shake();

        // Checks if the getDouble() method works from the Shaker class.
        // Compares the boolean value of the getDouble() with the boolean value of the test
        // (Comparing the value of each die rolled, if it's the same value.)
        if (shake.getDouble() == true && shake.getDie1Value() == shake.getDie2Value()) {

            getDoubleTestComplete = true;
        }

        // Checks if the boolean values from the getDouble() method are true.
        assertEquals(shake.getDouble(), getDoubleTestComplete);

    }

}