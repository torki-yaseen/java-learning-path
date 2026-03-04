import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        
        // 1. FILE HANDLING & DATA LOADING
        // We define the path to our external dictionary file
        File filePath = new File("src/word.txt");
        ArrayList<String> words = new ArrayList<>();

        // Try-with-resources: Automatically closes the reader even if an error occurs.
        // This is a "best practice" for memory management.
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            // Read the file line by line until it's empty
            while ((line = reader.readLine()) != null){
                words.add(line.trim()); // Add words to our list, removing extra spaces
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }

        // 2. WORD SELECTION
        // Use the Random class to pick a random index from our list
        Random random = new Random();
        // String word = words.get(random.nextInt(words.size())); // Dynamic selection

        // NOTE: This line overrides the random selection for testing purposes
        word = "lemon"; 
        
        // wordState tracks the underscores and correctly guessed letters
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        Scanner scanner = new Scanner(System.in);

        // Populate the wordState with underscores based on word length
        for (int i=0; i<word.length();i++){
            wordState.add('_');
        }

        System.out.println("***********************");
        System.out.println("Hangman game with Java!");
        System.out.println("***********************");

        // 3. MAIN GAME LOOP
        // The game continues until the player reaches 6 wrong guesses
        while (wrongGuesses < 6){
            // Display current hangman art based on failed attempts
            System.out.println(hangmanArts(wrongGuesses));
            
            // Print the current state of the word (e.g., l _ m _ n)
            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }

            // Capture user input
            System.out.print("\n Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            // 4. GUESS VALIDATION LOGIC
            // .indexOf(guess) returns -1 if the letter is NOT in the word
            if ((word.indexOf(guess)) >= 0){
                System.out.println("Correct guess");
                
                // Update every index where the guessed letter appears
                for (int i = 0 ; i < word.length(); i++){
                    if (word.charAt(i) == guess){
                        wordState.set(i, guess); // Update ArrayList at specific index
                    }
                }

                // 5. WIN CONDITION CHECK
                // If there are no underscores left, the user has guessed the full word
                if (!wordState.contains('_')){
                    System.out.println(hangmanArts(wrongGuesses));
                    System.out.println("You win");
                    System.out.println("Correct word was: " + word);
                    break; // Exit the while loop immediately
                }

            } else {
                // If the guess is wrong, increment the counter to change the art/end the game
                System.out.println(" Wrong guess");
                wrongGuesses++;
            }
        }

        // 6. LOSS CONDITION CHECK
        if (wrongGuesses >= 6){
            System.out.println(hangmanArts(wrongGuesses));
            System.out.println("Game over!");
            System.out.println("Correct word was: " + word);
        }
        
        scanner.close(); // Clean up the scanner resource
    }

    /**
     * Uses a modern Java Switch Expression to return the ASCII art.
     * This demonstrates clean, readable conditional logic.
     */
    static String hangmanArts(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> "\n\n\n";
            case 1 -> "\n   o\n\n\n";
            case 2 -> "\n   o\n   |\n\n";
            case 3 -> "\n   o\n  /|\n\n";
            case 4 -> "\n   o\n  /|\\\n\n";
            case 5 -> "\n   o\n  /|\\\n  /\n";
            case 6 -> "\n   o\n  /|\\\n  / \\\n";
            default -> "";
        };
    }
}
