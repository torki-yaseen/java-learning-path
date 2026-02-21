package abstractionLesson;

public abstract class Shape {
    // Triangle , Circle , Rectangle

    abstract double area(); // abstract method
    void display(){
        System.out.println("This is a shape.");
    }
}
