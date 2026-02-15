import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        // java game welcome message
        System.out.println("**********************************");
        System.out.println("** Let's play Rock-Paper-Scissor**");
        System.out.println("**********************************");

        // declare variable array of option , computer choice , user choice ,play again , random , scanner
        String options [] = {"Rock", "Paper", "Scissor"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            // take input from user , create random compute chose and show it
            System.out.print("Select (Rock - Paper - Scissor): ");
            userChoice = scanner.nextLine().toLowerCase();
            if(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissor")){
                System.out.println("Enter a valid entry!");
                continue;
            }
            computerChoice = options[random.nextInt(3)].toLowerCase();
            System.out.println("Computer choice: " + computerChoice);

            // create logic of winning
            if (userChoice.equals(computerChoice)){
                System.out.println("It'a a tie!");
            } else if ((userChoice.equals("rock")&&computerChoice.equals("scissor")) || (userChoice.equals("paper") && computerChoice.equals("rock")) || userChoice.equals("scissor") && computerChoice.equals("paper")){
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }
            // ask if you wanted to play again looping
            System.out.print("Do you want to play again: (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

        // goodbye message
        System.out.println("Thank you for playing with us today!");
    }
}
