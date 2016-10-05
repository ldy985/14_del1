package game;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Enter name. Names are saved as Name1 and Name2 variables.
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1. Please enter your name");
        String Name1 = scan.nextLine();
        System.out.println("Player 1: " + Name1);
        System.out.println("Player 2. Please enter your name");
        String Name2 = scan.nextLine();
        System.out.println("Player 2: " + Name2 + "\n" + "\n");

        Player player1 = new Player(Name1);
        Player player2 = new Player(Name2);
        Shaker shaker = new Shaker();

        boolean game = true;

        // Sets the player who starts the game
        player1.setIsTurn(true);

        System.out.println("Please press 'n' and press Enter");

        // While-loop runs as long as the win conditions hasn't been met (game == false)
        while (game == true) {

            String nextTurn = scan.nextLine();

            // Asks the user to press 'n' for each round in game
            if (nextTurn.equals("n")) {

                // Player 1's turn starts
                if (player1.getIsTurn() == true) {

                    // Player 1 rolls the dice
                    shaker.Shake();

                    // Player 1 gets the sum of the roll added to his/her's points
                    player1.addPoints(shaker.getSum());

                    // Game prompts with information about the turn
                    System.out.println(player1.getName() + "'s turn");

                    System.out.println("Die 1: " + shaker.getDie1Value());
                    System.out.println("Die 2: " + shaker.getDie2Value());

                    System.out.println("Player1 sum: " + shaker.getSum());
                    System.out.println(player1.getName() + "'s points " + player1.getPoints() + "\n");

                    // Resets point back to "0" if 2x 1 is rolled
                    if (shaker.getDie1Value() == 1 && shaker.getDie2Value() == 1) {
                        player1.setPoints(0);
                    }

                    // Win conditions
                    if (player1.getPoints() > 39 && shaker.getDouble() == true) {
                        System.out.println(player1.getName() + " wins");
                        System.out.println("GAME OVER");
                        game = false;
                    }

                    // win condition
                    // first time: Marks that you have rolled 2x 6
                    // Second time: Set Player 1 as winner if 2x 6 is rolled again
                    if (shaker.getSum() == 12) {

                        if (player1.getDouble6() == true) {

                            System.out.println(player1.getName() + " wins");
                            System.out.println("GAME OVER");
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
                    shaker.Shake();

                    player2.addPoints(shaker.getSum());

                    System.out.println(player2.getName() + "'s turn");

                    System.out.println("Die 1: " + shaker.getDie1Value());
                    System.out.println("Die 2: " + shaker.getDie2Value());

                    System.out.println("Player2 sum: " + shaker.getSum());

                    System.out.println(player2.getName() + "'s points " + player2.getPoints() + "\n");

                    // Resets point back to "0" if 2x 1 is rolled
                    if (shaker.getDie1Value() == 1 && shaker.getDie2Value() == 1) {
                        player2.setPoints(0);
                    }

                    // Win condition
                    if (player2.getPoints() > 39 && shaker.getDouble() == true) {
                        System.out.println(player2.getName() + " wins");
                        System.out.println("GAME OVER");
                        game = false;
                    }

                    // win condition
                    // first time: Marks that you have rolled 2x 6
                    // Second time: Set Player 2 as winner if 2x 6 is rolled again
                    if (shaker.getSum() == 12) {

                        if (player2.getDouble6() == true) {

                            System.out.println(player2.getName() + " wins");
                            System.out.println("GAME OVER");
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

            } else {

                // Asks the user to press n
                System.out.println("Press 'n' and press Enter!");

            }
        }
    }
}
