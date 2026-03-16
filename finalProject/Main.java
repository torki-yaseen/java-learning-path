package finalProject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // java alarm
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime;

        System.out.print("Enter alarm time (HH:MM:SS) : ");
        String inputTime = scanner.nextLine();

        alarmTime = LocalTime.parse(inputTime,formatter);
        System.out.println("Alarm set for : " + alarmTime);

        scanner.close();
    }
}
