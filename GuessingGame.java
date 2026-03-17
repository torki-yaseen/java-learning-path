import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempt = 0;
        int min =1 , max =100;
        int randomNumber = random.nextInt(min,max);
        System.out.println("Guessing Game!!");
        System.out.printf("Enter number between %d - %d \n",min,max);
        do {
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();
            attempt ++;
            if (guess < randomNumber){
                System.out.println("Guess higher! try again!");
            } else if (guess > randomNumber) {
                System.out.println("Guess lower! try again!");
            }else {
                System.out.printf("Correct ! you got it after %d trial", attempt);
            }
        }while (guess != randomNumber);
        scanner.close();
    }
}
