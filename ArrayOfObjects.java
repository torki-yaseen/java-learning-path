public class ArrayOfObjects {
    String color;
    String model;

    ArrayOfObjects(String color, String model){
        this.color = color;
        this.model = model;
    }

    void drive(){
        System.out.println(this.model + " is driven, it's  " + this.color);
    }
}
