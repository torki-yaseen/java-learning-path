import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        // Hangman game
        String word = "Lemon";
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses =0;
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<word.length();i++){
            wordState.add('_');
        }
        System.out.println("***********************");
        System.out.println("Hangman game with Java!");
        System.out.println("***********************");
        System.out.print("Word: ");
        for(char c : wordState){
            System.out.print(c+ " ");
        }
        scanner.close();
    }
    static String hangmanArts(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                       o    
                    
                    
                    """;
            case 2 -> """
                       o    
                       | 
                    
                    """;
            case 3 -> """
                       o    
                      /| 
                    
                    """;
            case 4 -> """
                       o    
                      /|\\ 
                    
                    """;
            case 5 -> """
                       o    
                      /|\\ 
                      /
                    """;
            case 6 -> """
                       o    
                      /|\\ 
                      / \\
                    """;
            default -> "";
        };
    }
}
