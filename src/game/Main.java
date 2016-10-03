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
        System.out.println("Player 2: " + Name2);

        Player player1 = new Player(Name1);
        Player player2 = new Player(Name2);
        Shaker shaker = new Shaker();

        boolean game = true;

        while (game = true) {
            if (player1.isTurn) {
                shaker.Shake();
                System.out.println(player1.getName() + "'s turn");
                System.out.println(player1.getName() + "'s points " + player1.getPoints());
            } else if (player2.isTurn) {
                shaker.Shake();
                System.out.println(player2.getName() + "'s turn");
                System.out.println(player2.getName() + "'s points " + player2.getPoints());
            }


            // win conditions
            if (Player1Points > 39) ;
            {
                System.out.println(player1.getName() + " wins");
                System.out.println("GAME OVER");
                game = false;

            }

            if (Player2Points > 39) ;
            {
                System.out.println(player2.getName() + " wins");
                System.out.println("GAME OVER");
                game = false;

            }
            if (SumOfTwoDice > 11 && player1.isturn) ;
            {
                System.out.println(player1.getName() + " wins");
                System.out.println("GAME OVER");
                game = false;
            }
            if (SumOfTwoDice > 11 && player2.isturn) ;
            {
                System.out.println(player2.getName() + " wins");
                System.out.println("GAME OVER");
                game = false;
            }
        }
    }
}
