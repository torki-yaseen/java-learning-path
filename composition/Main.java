package composition;

public class Main {
    public static void main(String[] args) {
        /*
        Composition = represents a "part-of" relationship between objects. for example, an engine is "part of" a car. allows complex objects to be constructed from smaller objects.
         */
        Car car1 = new Car("F150",2025,"V8");

        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.engine.type);// use access modifier
        car1.start();
    }
}
