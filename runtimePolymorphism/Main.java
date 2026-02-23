package runtimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Runtime polymorphism = when the method that get executed is decided at runtime based on the actual type of object
 */
        // declare variables
Scanner scanner = new Scanner(System.in);
int choice;
Animal animal;
        // take chooses for user
        System.out.print("Would you like dog or cat, choose (1.dog) or (2.cat): ");
        choice = scanner.nextInt();
        // use runtime polymorphism
switch (choice){
    case 1 -> {animal = new Dog();
    animal.speak();
    }
    case 2 -> {animal = new Cat();
    animal.speak();
    }
}
    }
}
