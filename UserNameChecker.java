import java.util.Scanner;

public class UserNameChecker {
    public static void main(String[] args) {
        // username must be between 4-12 character
        // username must not contain _ or spaces

        Scanner scanner = new Scanner(System.in);
        String userName;
        boolean isValid = true;
        while (true){

            System.out.print("\nEnter your username: ");
            userName = scanner.nextLine();

            // logic validation

            if (userName.length() >12 || userName.length() <4){
                isValid = false;
            }else {
                isValid = true;
            }

            // printing of the logic
            if (isValid){
                System.out.printf("Username \"%s\" is valid" , userName);
            }else {
                System.out.printf("Stick to rules and enter a valid user name as \"%s\" is not valid\n",userName);
            }
        }
    }
}
