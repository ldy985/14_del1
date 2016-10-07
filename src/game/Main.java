package game;

import desktop_resources.GUI;

public class Main {

    public static void main(String[] args) {

        //Initialize Objects and variables
        final Shaker shaker = new Shaker();
        boolean game = true;

        //Create empty GUI and open it
        GUI.setDice(0, 0, 0, 0, 0, 0);


        //Enter name. Names are saved as Name1 and Name2 variables.
        String Name1 = GUI.getUserString("Player 1. Please enter your name");
        String Name2 = GUI.getUserString("Player 2. Please enter your name");

        Player player1 = new Player(Name1);
        Player player2 = new Player(Name2);


        // Sets the player who starts the game
        player1.setIsTurn(true);


        // While-loop runs as long as the win conditions hasn't been met (game == false)
        while (game == true) {

            // Player 1's turn starts
            if (player1.getIsTurn() == true) {

                // Player 1 rolls the dice
                shaker.shake();

                // Player 1 gets the sum of the roll added to his/her's points
                player1.addPoints(shaker.getSum());

                //Update GUI with the dice roll
                GUI.setDice(shaker.getDie1Value(), shaker.getDie2Value());

                //Show info about the turn to the GUI
                GUI.showMessage(player1.getName() + " rolled a sum of " + shaker.getSum() + " and now has " + player1.getPoints() + " points.");

                // Resets point back to "0" if 2x 1 is rolled
                if (shaker.getDie1Value() == 1 && shaker.getDie2Value() == 1) {
                    player1.setPoints(0);
                }

                // Win conditions
                if (player1.getPoints() > 39 && shaker.getDouble() == true) {
                    GUI.showMessage(player1.getName() + " has WON! \nPress OK to end the game.");
                    game = false;
                }

                // win condition
                // first time: Marks that you have rolled 2x 6
                // Second time: Set Player 1 as winner if 2x 6 is rolled again
                if (shaker.getSum() == 12) {

                    if (player1.getDouble6() == true) {
                        GUI.showMessage(player1.getName() + " has WON! \nPress OK to end the game.");
                        game = false;

                    } else {

                        player1.setDouble6(true);
                    }

                } else {

                    player1.setDouble6(false);
                }


                // Gives extra turn if the two dice roll the same value
                if (!shaker.getDouble() == true) {

                    player1.setIsTurn(false);
                    player2.setIsTurn(true);
                }

            } else {

                // Player 2's turn starts
                shaker.shake();

                player2.addPoints(shaker.getSum());

                //Update GUI with the dice roll
                GUI.setDice(shaker.getDie1Value(), shaker.getDie2Value());

                //Show info about the turn to the GUI
                GUI.showMessage(player2.getName() + " rolled a sum of " + shaker.getSum() + " and now has " + player2.getPoints() + " points.");

                // Resets point back to "0" if 2x 1 is rolled
                if (shaker.getDie1Value() == 1 && shaker.getDie2Value() == 1) {
                    player2.setPoints(0);
                }

                // Win condition
                if (player2.getPoints() > 39 && shaker.getDouble() == true) {
                    GUI.showMessage(player2.getName() + " has WON! \nPress OK to end the game.");
                    game = false;
                }

                // win condition
                // first time: Marks that you have rolled 2x 6
                // Second time: Set Player 2 as winner if 2x 6 is rolled again
                if (shaker.getSum() == 12) {

                    if (player2.getDouble6() == true) {
                        GUI.showMessage(player2.getName() + " has WON! \nPress OK to end the game.");
                        game = false;

                    } else {

                        player2.setDouble6(true);

                    }

                } else {

                    player2.setDouble6(false);

                }

                // Gives extra turn if the two dice roll the same value
                if (!shaker.getDouble() == true) {

                    player2.setIsTurn(false);
                    player1.setIsTurn(true);
                }

            }
        }

        //Exit the game
        GUI.close();
    }
}
