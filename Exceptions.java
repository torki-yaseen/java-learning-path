import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        /*
        Exceptions = An event that interrupts the normal flow of a program .
        (Dividing by zero, file not found, mismatch input type)
        Surrounding any dangerous code with a try{} block
        try{}, catch{}, finally{}
         */
        // try to get a number for a user ,but you have to validate the input ArithmeticException
        try (Scanner scanner = new Scanner(System.in)) { // surrounding by try with resource catch
                System.out.print("Enter a number:");
                int number = scanner.nextInt();

            } catch (ArithmeticException e) {
                System.out.println("Your can't divide by Zero!");
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number!");
            } catch (Exception e) {
                System.out.println("Something went wrong!");
            } finally {
                System.out.println("This always happen ☺");
            }
        }
    }



