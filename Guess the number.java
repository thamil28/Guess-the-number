import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};
        
        while (true) {
            System.out.println("Enter move (Rock, Paper, Scissors). To exit the game, type exit: ");
            String userMove = scanner.nextLine();
            
            if (userMove.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (!userMove.equalsIgnoreCase("Rock") && 
                !userMove.equalsIgnoreCase("Paper") && 
                !userMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerMove = options[computerIndex];
            
            System.out.println("Computer move: " + computerMove);

            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors") || 
                       userMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock") || 
                       userMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
        System.out.println("Game Over.");
    }
}