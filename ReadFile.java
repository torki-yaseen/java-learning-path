import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // program to read a file
        String filePath= "C:\\Users\\Desktop\\test.txt";
        String line =" ";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) !=null){
                System.out.println(line);
                Thread.sleep(1000);
            }
        }catch (FileNotFoundException e){
            System.out.println("File could not found!");
        }catch (IOException | InterruptedException e){
            System.out.println("Some thing went wrong!");
        }
    }
}
