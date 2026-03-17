import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        do {
            System.out.print("Your age can't be zero or less.\n Enter your age: ");
            age = scanner.nextInt();
        }while (age <=0);
        System.out.printf("Your age is %d years old",age);
    }
}
