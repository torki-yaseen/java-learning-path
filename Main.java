import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime;

        System.out.print("Enter an alarm time (HH:MM:SS): ");
        String inputTime = scanner.nextLine();

        // The project continues here to parse inputTime and start the loop...

        scanner.close();
// code is under construction 
    }
}