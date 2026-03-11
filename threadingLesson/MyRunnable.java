package threadingLesson;

/**
 * MyRunnable implements the Runnable interface to create a thread-safe countdown timer.
 * This class demonstrates basic threading concepts including sleep and exception handling.
 */
public class MyRunnable implements Runnable {

    /**
     * Overrides the run() method from the Runnable interface.
     * This method executes when the thread is started.
     * Creates a 5-second countdown timer that prints "Times up!" and exits the program.
     */
    @Override
    public void run() {
        // Loop from 0 to 5 to create a 5-second countdown timer
        for (int i = 0; i <= 5; i++) {
            try {
                // Pause the thread execution for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the case where another thread interrupts this thread's sleep
                System.out.println("Something interrupted the thread");
            }
            
            // Check if countdown is complete (i reaches 5)
            if (i == 5) {
                System.out.println("Times up!");
                // Exit the entire program
                System.exit(0);
            }
        }
    }
}