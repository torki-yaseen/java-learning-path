import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        // Count DownTimer in java.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # of second to count down: ");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = scanner.nextInt();
            @Override
            public void run() {
                System.out.println(count);
                count --;
                if (count <=0){
                    System.out.println("Times up.");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task,0,1000);
        scanner.close();
    }
}
