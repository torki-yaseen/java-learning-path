public class ArrayOfObjectsMain {

    public static void main(String[] args) {
        ArrayOfObjects car1 = new ArrayOfObjects("black","taho");
        ArrayOfObjects car2 = new ArrayOfObjects("white","F150");
        ArrayOfObjects car3 = new ArrayOfObjects("red","accent");

        ArrayOfObjects collection[] = {car1,car2,car3};

        for (int i=0; i< collection.length; i++){
            collection[i].drive();
        }
        for (ArrayOfObjects car : collection){
            car.color="Black";
        }
        for (int i=0; i< collection.length; i++){
            collection[i].drive();
        }
    }
}
