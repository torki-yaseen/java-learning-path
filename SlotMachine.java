import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        // java slot machine
        // declare variables
        Scanner scanner = new Scanner(System.in);
        int bet;
        int balance = 100;
        int payOut;
        String row[];
        String playAgain = "y";
        // show welcome message
        System.out.println("**********************");
        System.out.println("**Java Slot Machine!**");
        System.out.println("Symbols:🍒 🍉 🍋 🔔 ⭐");
        System.out.println("**********************");

        // start the logic of the machine with loop
        while (balance > 0) {
            // enter the bet and show balance
            System.out.printf("Current balance $ %d \n", balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            // validate if there is no balance
            if (balance < 0) {
                System.out.println("You don't have balance to bet!");
                continue;
            }
            // validate if bet greater than balance
            if (bet > balance) {
                System.out.println("No Sufficient balance.");
                continue;
            }
            // validate if bet is negative
            else if (bet < 0) {
                System.out.println("Bet can't be less than zero");
            } else {
                // deduct bet from balance
                balance -= bet;
            }
            // spin the row
            System.out.println("Spinning.....");
            row = spinRow();
            // print the row
            printRow(row);
            // get payout
            payOut = getPayOut(row, bet);
            if (payOut > 0) {
                System.out.println("You won $" + payOut);
                balance += payOut;
            } else {
                System.out.println("Sorry, you lost this round.");
            }
            // ask if wanted to play again
            System.out.print("Do you want to play again(Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")){
                break;
            }
        }
        // end the program
        System.out.println("Game over! Your final balance " +balance);
        scanner.close();
    }

    static String[] spinRow() {
        String symbols[] = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String row[] = new String[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayOut(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 50;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 50;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
