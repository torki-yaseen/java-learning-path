package enumInAction;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
/*
Enums = (Enumerations) A special kind of class that represents a fixed set of constants.
They improve code readability and reliability.
More efficient with switches than Strings.
 */
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String respond = scanner.nextLine().toUpperCase();
        try{
            Day day = Day.valueOf(respond);
            switch (day ){
                case MONDAY,
                     THUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     SUNDAY -> System.out.println("Day of the week!");
                case FRIDAY,
                     SATURDAY -> System.out.println("It's weekend");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Enter a valid day!");
        }

       scanner.close();
    }
}
