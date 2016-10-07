
package test;


import static org.junit.Assert.*;


public class PlayerTest {
    game.Player testPlayer = new game.Player("Player1");


    @org.junit.Test
    public void getName() {
        assertEquals("Player1", testPlayer.getName());
    }

    @org.junit.Test
    public void setPoints() {
        testPlayer.setPoints(100);
        assertEquals(100, testPlayer.getPoints());

        testPlayer.setPoints(0);
        assertEquals(0, testPlayer.getPoints());
    }

    @org.junit.Test
    public void setIsTurn() {
        testPlayer.setIsTurn(true);
        assertEquals(true, testPlayer.getIsTurn());

        testPlayer.setIsTurn(false);
        assertEquals(false, testPlayer.getIsTurn());
    }

    @org.junit.Test
    public void addPoints() {
        testPlayer.setPoints(0);
        testPlayer.addPoints(100);

        assertEquals(100, testPlayer.getPoints());

        //test overflow
        testPlayer.setPoints(0);
        testPlayer.addPoints(Integer.MAX_VALUE);
        testPlayer.addPoints(1);
        assertEquals(testPlayer.getPoints() > Integer.MAX_VALUE, testPlayer.getPoints());

    }

}
