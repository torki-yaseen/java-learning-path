import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        /*
FileWriter = good for small or medium-sized text files
BufferedWriter = better performance for large amounts of text
PrintWriter = best for structured data like reports or logs
FileOutputStream = best for binary files(e.g images audio files)
 */
        // program to write a simple txt file
        // declare variables
        String filePath = "C:\\Users\\Desktop\\test.txt";
        String txt = """
                 Next year I would created my own portfolio of app
                 Next year I will be happier
                 Next year i will be with my family
                 Next year i will have ***k$
                 After Allah will One day I will be
                 Follow your heart desire
                 Follow your dreams
                 You don't know
                 You will see
                 Just if you believe
                 Just believe and achieve
                """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(txt);
            System.out.println("File had create successfully!");
        }catch (FileNotFoundException e){
            System.out.println("File couldn't fount!");
        }
        catch (IOException e) {
            System.out.println("Could not write a file!");
        }
    }
}

