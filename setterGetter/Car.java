package setterGetter;

public class Car {
    private  String module;
    private String color;
    private int price;

    Car(String module, String color, int price){
        this.module= module;
        this.color= color;
        this.price= price;
    }
    String getModule(){
        return this.module= module;
    }
    String getColor(){
        return this.color= color;
    }
    String getPrice(){
        return "$" + this.price;
    }
    void setColor(String color){
        this.color= color;
    }
    void setPrice(int price){
        if (price <0){
            System.out.println("Price cant be zero or less");
        }else {
            this.price= price;
        }
    }
}

