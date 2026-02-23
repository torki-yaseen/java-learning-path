package polymorphism;

public class Main {
    public static void main(String[] args) {
        /*
        Polymorphism = poly = many , morph = shape
        Objects can identify as other objects.
        Objects can be treated as objects of common superclass.
         */
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[]vehicles = {car,boat,bike};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
