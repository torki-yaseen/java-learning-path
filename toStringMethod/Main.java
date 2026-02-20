package toStringMethod;

public class Main {
    public static void main(String[] args) {
        /*
        .toString()= Method inherited from the Object class. Used to return a string representation of an object. By default, it returns a hash code as a unique identifier.
        it can be overridden to provide meaningful details.
         */
        Car car1 = new Car("Ford","F150",2026,"black");
        Car car2 = new Car("Ford", "Mustang",2025,"red");

        System.out.println(car1);
        System.out.println(car2);
    }
}
