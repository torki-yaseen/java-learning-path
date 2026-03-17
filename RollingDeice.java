import java.util.Random;
import java.util.Scanner;

public class RollingDeice {
    public static void main(String[] args) {
        // rolling dice
        // declare variable
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice;
        int total=0;
        boolean isRunning = true;
        // take input from user and validate if not zero or less if logic
        while (isRunning){
            System.out.print("Enter number of dice wanted to be in use(exit 99) : ");
            dice = scanner.nextByte();
            if (dice > 0) {
                for (int i = 0; i < dice; i++) {
                    int roll = random.nextInt(1, 7);
                    printRoll(roll);
                    System.out.println("You rolled " + roll);
                    total += roll;

                }
            }else if (dice ==99) {
                isRunning=false;
            }else {
                System.out.println("Dice cant be zero try again!");
            }
            System.out.println("total: " + total);
        }
        scanner.close();
    }
    // create roll dice method with switch logic and ascii art
    static void printRoll (int roll){

        String dice1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------
                 """;
        String dice2 = """
                  -------
                 | ●     |
                 |       |
                 |     ● |
                  -------
                 """;
        String dice3 = """
                  -------
                 | ●     |
                 |   ●   |
                 |     ● |
                  -------
                 """;
        String dice4 = """
                  -------
                 | ●   ● |
                 |       |
                 | ●   ● |
                  -------
                 """;
        String dice5 = """
                  -------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  -------
                 """;
        String dice6 = """
                  -------
                 | ●   ● |
                 | ●   ● |
                 | ●   ● |
                  -------
                 """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("invalid input");

        }
    }
}
