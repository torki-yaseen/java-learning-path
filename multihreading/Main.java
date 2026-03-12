package multihreading;

public class Main {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable("bing");
//        MyRunnable myRunnable2 = new MyRunnable("bong");
        Thread thread1 = new Thread(new MyRunnable("bing"));
        Thread thread2 = new Thread(new MyRunnable("bong"));
        System.out.println("Game started");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Thread had been interrupted");
        }
        System.out.println("Game over!");
    }
}
