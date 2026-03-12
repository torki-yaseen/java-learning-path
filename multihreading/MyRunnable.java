package multihreading;

public class MyRunnable implements Runnable{

    private final String name;

    MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i=0; i<=5 ; i++){
            try {
                Thread.sleep(1000);
                System.out.println(name);
            }catch (InterruptedException e){
                System.out.println("Thread was interacted");
            }
//            if (i ==5){
//                System.exit(0);
//            }
        }
    }
}
