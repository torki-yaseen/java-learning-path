import java.util.Scanner;

public class QuitGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respond="";
        while (!respond.equals("Q")){
            System.out.println("You're playing a game!");
            System.out.print("Press Q to quit: ");
            respond = scanner.nextLine().toUpperCase();
        }
        System.out.println("You quit see you later soon!");
        scanner.close();
    }
}
