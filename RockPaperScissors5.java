import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) 
        {
            System.out.println("                                           ");
            System.out.println("Rock, Paper, Scissors - Enter your choice: ");
            System.out.print("1. Rock\n2. Paper\n3. Scissors\n4. Quit\n");

            int userChoice = scanner.nextInt();
            
            if (userChoice == 4) {
                System.out.println("Goodbye!");
                break;
            } else if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                continue;
            }

            String userSelection = choices[userChoice - 1];
            String computerSelection = choices[random.nextInt(3)];

            System.out.println("You chose: " + userSelection);
            System.out.println("Computer chose: " + computerSelection);

            if (userSelection.equals(computerSelection)) {
                System.out.println("It's a tie!");
            } else if ((userSelection.equals("rock") && computerSelection.equals("scissors")) ||
                       (userSelection.equals("paper") && computerSelection.equals("rock")) ||
                       (userSelection.equals("scissors") && computerSelection.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
