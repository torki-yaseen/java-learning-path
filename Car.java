public class Car {
    /*
    object = an entity which hold data (attributes)
    and can perform actions (methods)
    it's a reference data type
     */
    String manufacture ="ford";
    String model ="f150";
    int year =2026;
    double price = 59999.99;
    boolean isRunning = false;

    void stop(){
        isRunning = false;
        System.out.println(model + " its stopped now.");
    }
    void drive(){
        isRunning = true;
        System.out.println(model + " its moving now.");
    }
    void start(){
        System.out.println("car is started");
    }
}
