import org.w3c.dom.css.ElementCSSInlineStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        // Hangman game
        File filePath = new File("src/word.txt");
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        word = "lemon";
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses =0;
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<word.length();i++){
            wordState.add('_');
        }
        System.out.println("***********************");
        System.out.println("Hangman game with Java!");
        System.out.println("***********************");
        while (wrongGuesses <6){
            System.out.println(hangmanArts(wrongGuesses));
            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c+ " ");
            }
            System.out.print("\n Guess a letter:");
            char guess = scanner.next().toLowerCase().charAt(0);

            // to know if the word is correct or not
            if ((word.indexOf(guess)) >=0){
                System.out.println("Correct guess");
                for (int i =0 ; i<word.length();i++){
                    // check in which index is the correct answer
                    if (word.charAt(i) == guess){
                        // update the wordState the ArrayList
                        wordState.set(i,guess);
                    }
                }

                    if (!wordState.contains('_')){
                        System.out.println(hangmanArts(wrongGuesses));
                        System.out.println("You win");
                        System.out.println("Correct word was: " + word);
                        break;
                    }

            }else {
                System.out.println(" Wrong guess");
                wrongGuesses ++;
            }
        }
        if (wrongGuesses >=6){
            System.out.println(hangmanArts(wrongGuesses));
            System.out.println("Game over!");
            System.out.println("Correct word was: " + word);
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
