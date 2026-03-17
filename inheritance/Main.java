package inheritance;
public class Main {
    public static void main(String[] args) {
        /*
        Inheritance = one class inherits the attributes and methods from another class.
        Child -> Parents -> Grandparent
         */
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();cat.eat();plant.photosynthesis();
        dog.sound();cat.sound();

    }
}
