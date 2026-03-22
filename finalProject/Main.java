package finalProject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // java alarm
       Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime =null;
        String filePath = "src/finalProject/alarm.wav";
        while(alarmTime == null){
            try{
                System.out.print("Enter in alarm time(HH:MM:SS) : ");
                String inputTime = scanner.nextLine();

                alarmTime= LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for " + alarmTime) ;

            }catch (DateTimeParseException e){
                System.out.println("Enter valid input time! Use HH:MM:SS");
            }
        }
        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
