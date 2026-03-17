import java.util.Scanner;

public class Statement {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();

        System.out.print("Enter your age ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (ture/false) : ");
        boolean student = scanner.nextBoolean();

        // Group 1
        if (name.isEmpty()){
            System.out.println("You did not enter your name!🤐");
        }else {
            System.out.println("Welcome " + name+"😎");
        }

        // Group 2
        if (age >=65){
            System.out.println("You're a senior.☺");
        } else if (age >=18) {
            System.out.println("You're an adult.😊");
        }else if (age >=13){
            System.out.println("You're a teenage.😘");
        } else if (age >=1) {
            System.out.println("You're a child.🥰");
        }else if (age == 0){
            System.out.println("You're a baby.😍");
        }else {
            System.out.println("You did not born yet!😇");
        }

        // Group 3
        if (student){
            System.out.println("You're a student.🤠");
        }else {
            System.out.println("You're not a student.😲");
        }
    }
}
