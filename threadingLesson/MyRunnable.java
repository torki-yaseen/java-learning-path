package threadingLesson;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        // threading part 3 part for timer , thread sleep . if
        for (int i=0; i<= 5; i++){

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("something interrupted the thread ");
            }
            if (i == 5){
                System.out.println("Times up!");
                System.exit(0);
            }
        }
    }
}
