package threadingLesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // program asking you to input your name and give your number of second or program will exit
        Scanner  scanner = new Scanner(System.in);
        // create the thread runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // to allow first thread to run
        thread.setDaemon(true);
        thread.start();
        System.out.println("You have 5 second only!");
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
        System.out.printf("Hello %s" , name);

        scanner.close();
    }
}
