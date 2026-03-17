import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ShoppingCart {
    // shopping cart program
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency ='$';
        double total ;

        System.out.print("What do you want to order Sir?:");
        item = scanner.nextLine();
        System.out.print("How many piece do you want?:");
        quantity = scanner.nextInt();
        System.out.print("What how much is the price?:");
        price = scanner.nextDouble();
        total = quantity * price;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        scanner.close();
    }

}
