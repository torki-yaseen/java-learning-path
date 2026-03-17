import java.util.Scanner;
public class Scan {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("your name " + name + ". You are " + age + " years old" + ". Your gpa is " + gpa + ". Your favourite color is " + color + ".");

    }
}
