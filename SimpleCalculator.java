import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result = 0;
        char operator;
        boolean isValid = true;
        while (true) {
            System.out.println("\n***Welcome to your calculator***\n");
            System.out.print("Enter your first number: ");
            number1 = scanner.nextDouble();
            System.out.print("Enter operator (+,-,*,/,^): ");
            operator = scanner.next().charAt(0);// a trick to take char from the user
            System.out.print("Enter your second number: ");
            number2 = scanner.nextDouble();

            switch (operator) {
                case '+' -> result = number1 + number2;
                case '-' -> result = number1 - number2;
                case '*' -> result = number1 * number2;
                case '^' -> result = Math.pow(number1, number2);
                case '/' -> {
                    if (number2 == 0) {
                        System.out.println("Cant divided by 0");
                        isValid = false;
                    } else {
                        result = number1 / number2;
                    }
                }
                default -> {
                    System.out.println("Invalid operator!");
                    isValid = false;
                }
            }
            if (isValid) {
                System.out.printf("Result : %.2f\n", result);
            }
        }
    }
}
