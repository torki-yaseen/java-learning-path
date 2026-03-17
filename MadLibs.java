import java.util.*;
public class MadLibs {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String verb;
        String noun;
        System.out.print("Enter an an adjective (description)");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an an adjective (description)");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an an adjective (description)");
        adjective3 = scanner.nextLine();
        System.out.print("Enter a noun (person or place)");
        noun = scanner.nextLine();
        System.out.print("Enter a verb (ending with ing)");
        verb = scanner.nextLine();

        System.out.println("\n Today I went to " + noun +". It's a " + adjective1 + " place.");
        System.out.println("I was "+ verb + " to " + adjective2 + " people.");
        System.out.println(noun + " used to be a " + adjective3 );
        scanner.close();

    }
}
