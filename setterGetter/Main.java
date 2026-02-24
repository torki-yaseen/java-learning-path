package setterGetter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Camry","white",10000);
        car.setPrice(20000);
        System.out.println(car.getModule() + " " + car.getColor() + " " + car.getPrice());
    }
}
