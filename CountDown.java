import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many second to count down: ");
        int start = scanner.nextInt();
        for (int i = start ;i > 0 ; i-- ){
            System.out.println(i);
            Thread.sleep(1000);// means 1 second
        }
        System.out.println("It's time!");
        scanner.close();
    }
}
