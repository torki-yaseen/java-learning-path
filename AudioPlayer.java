import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) {
        // audio player
        String filePath ="src/song.wav";
        File file = new File(filePath);

        // logic of player
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); Scanner scanner = new Scanner(System.in)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String respond = "";
            while (!(respond =="Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Rest");
                System.out.println("Q = Quit");
                // take respond from the user
                System.out.print("Enter your Chose: ");
                respond  = scanner.nextLine().toUpperCase();
                switch (respond){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> respond = "Q";
                    default -> System.out.println("invalid selection");
                }

            }

        }catch (LineUnavailableException e){
            System.out.println("another app is running!");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Unsupported file type!");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Bye");
        }
    }
}

