public class CarStudentMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Student first = new Student("first",22,2.5);
        Student second = new Student("second",23,2.6);
        Student third = new Student("third",24,2.7);

        third.study();
        car1.drive();
        car1.stop();
        System.out.println(car1.price);
    }
}
