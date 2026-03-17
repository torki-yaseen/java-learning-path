import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // create scanner and close it
        Scanner scanner = new Scanner(System.in);

        // create variables
        double weight;
        double newWeight;
        int choice;
        while (true) {
            // prompt for input from user and take his choice
            System.out.println("**Welcome to weight converter choose for the options:**");
            System.out.println("1 : convert lbs to kg.");
            System.out.println("2 : convert kg to lbs.");
            System.out.print("Choose an option :");
            choice = scanner.nextInt();
            // create 3 rules and print the result 1 lbs ~ kg0.453593 and display the result
            if (choice == 1) {
                System.out.print("Enter lbs value:");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("\n%.1f lbs is equivalent of %.1f kg\n", weight, newWeight);
            } else if (choice == 2) {
                System.out.print("Enter kg value:");
                weight = scanner.nextDouble();
                newWeight = weight / 0.453592;
                System.out.printf("\n%.1f kg is equivalent of %.1f lbs\n", weight, newWeight);
            } else {
                System.out.println("Enter a valid choice to start.");
            }
        }
    }
}
