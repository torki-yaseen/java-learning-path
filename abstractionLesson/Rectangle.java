package abstractionLesson;

public class Rectangle extends Shape{
    
    double width;
    double length;
    // constructor
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    @Override
    double area(){
        return width*length;
    }
}
