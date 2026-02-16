import java.util.Scanner;

public class QuestionBank {
    public static void main(String[] args) {
        // question bank in java welcome message
        System.out.println("********************************");
        System.out.println("Welcome to Java questions bank!");
        System.out.println("********************************");
        // questions[]
        String []questions ={"Which planet is known as the Red Planet?",
                "What is the capital city of Canada?",
                "Who wrote the play \"Romeo and Juliet\"?",
                "What is the chemical symbol for water?",
                "Which is the largest ocean on Earth?",
                "How many colors are there in a rainbow?",
                "Which animal is known as the 'Ship of the Desert'?",
                "Which gas do humans need to breathe to survive?",
                "What is the largest continent by land area?",
                "In which country were the first modern Olympic Games held?"};
        // options [][]
        String [][]options ={{"1.Venus", "2. Mars", "3. Jupiter", "4. Saturn"},{"1.Toronto","2. Vancouver", "3. Ottawa", " 4. Montreal"},
         {"1.Charles Dickens ","2. William Shakespeare", "3. Mark Twain"," 4. Jane Austen"},
         {"1.CO2", "2. H2O"," 3. NaCl", "4. O2"},
         {"1.Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"},
                {"1.5", "2. 6", "3. 7", "4. 8"},
                {"1.Horse" ,"2. Camel", "3. Elephant", "4. Lion"},
                {"1.Nitrogen", "2. Carbon Dioxide", "3. Oxygen", "4. Helium"},
                {"1.Africa" ,"2. Asia", "3. Europe", "4. North America"},
                {"1.Greece", "2. Italy", "3. France", "4. Egypt"}};
        // declare answers
        int answers[] = {2, 3, 2, 2, 4, 3, 2, 3, 2, 1};
        // declare variables (scanner, guesses, score)
        Scanner scanner = new Scanner(System.in);
        int guess;
        int score =0;
        // loop to: display the question , display options of answer, take user guess , show result, count score.
        for (int i =0; i< questions.length;i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();
            if (guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score ++;
            }else {
                System.out.println("******");
                System.out.println("Wrong!");
                System.out.println("******");
            }
        }
        // print final result.
        System.out.printf("Your final sore is %d , out of %d",score,questions.length);
        scanner.close();
    }
}
