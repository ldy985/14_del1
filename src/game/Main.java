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

        player1.setIsTurn(true);
        player1.setDouble6(false);
        player2.setDouble6(false);

        System.out.println("Please press 'n' and press Enter");

        while (game == true) {

            String nextTurn = scan.nextLine();

            if(nextTurn.equals("n")) {

                // Player 1's turn

                if (player1.getIsTurn() == true) {

                    shaker.Shake();

                    player1.addPoints(shaker.getSum());

                    System.out.println(player1.getName() + "'s turn");

                    System.out.println("Die 1: " + shaker.getDie1Value());
                    System.out.println("Die 2: " + shaker.getDie2Value());

                    System.out.println("Player1 sum: " + shaker.getSum());
                    System.out.println(player1.getName() + "'s points " + player1.getPoints() + "\n");

                    // win conditions
                    if (player1.getPoints() > 39) {
                        System.out.println(player1.getName() + " wins");
                        System.out.println("GAME OVER");
                        game = false;


                    }

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

                    // Gives extra trun if rolled double

                    if (!shaker.getDouble() == true) {

                        player1.setIsTurn(false);
                        player2.setIsTurn(true);

                    }


                } else {

                    // Player 2's turn
                    shaker.Shake();

                    player2.addPoints(shaker.getSum());

                    System.out.println(player2.getName() + "'s turn");

                    System.out.println("Die 1: " + shaker.getDie1Value());
                    System.out.println("Die 2: " + shaker.getDie2Value());

                    System.out.println("Player2 sum: " + shaker.getSum());

                    System.out.println(player2.getName() + "'s points " + player2.getPoints() + "\n");

                    if (player2.getPoints() > 39) {
                        System.out.println(player2.getName() + " wins");
                        System.out.println("GAME OVER");
                        game = false;

                        System.out.println("4");
                    }

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


                    if (!shaker.getDouble() == true) {

                        player2.setIsTurn(false);
                        player1.setIsTurn(true);

                    }

                }

            } else {

                System.out.println("Press 'n' and press Enter!");

            }



        }

    }
}
