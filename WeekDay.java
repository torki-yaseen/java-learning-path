import java.util.Scanner;

public class WeekDay {
    public static void main(String[]args){
        // take input from use
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter the day:");
            String day = scanner.nextLine();

            // create logic of the response for each day using enhanced switch and print the result
            switch (day){
                case "Saturday","Sunday","Monday","Tuesday","Wednesday", "Thursday" -> System.out.println("Hard day 🤐");
                case "Friday" -> System.out.println("its funDay 😎");
                default -> System.out.println("its not a day");
            }
        }
    }
}
