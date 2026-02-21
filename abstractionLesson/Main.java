package abstractionLesson;

public class Main {
    /*
    abstract = Used to define abstract classes and methods.
    Abstraction is the process of hiding implementation details and showing only the essential features;
    Abstract classes Can't be instantiated directly
    Can contain 'abstract' methods ( which must be implemented)
    Can contain 'concrete' methods (which are inherited
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(5,3);

        rectangle.display();
        System.out.printf("rectangle area is %.2f\n",rectangle.area());
        circle.display();
        System.out.printf("circle  area is %.2f \n",circle.area());
        triangle.display();
        System.out.printf("triangle  area is %.2f \n",triangle.area());
    }
}
