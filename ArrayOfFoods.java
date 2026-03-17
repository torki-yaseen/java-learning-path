import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfFoods {
    public static void main(String[] args) {
        // create an array of item where the number of item is unknow or taken from the user
        // create variable
        Scanner scanner = new Scanner(System.in);
        int size;
        String foods [];
        // take the size of the array from the user
        System.out.print("Enter number of element: ");
        size = scanner.nextInt();
        // clear the scanner nextInt() after it scanner.nextLine()
        scanner.nextLine();

        // declare the array size
        foods = new String[size];
        // take the value for your array from the user
        for (int i=0; i< foods.length;i++){
            System.out.print("Enter you food order: ");
            foods[i]= scanner.nextLine();
        }
        // sort it alphabetically
        Arrays.sort(foods);
        // print the array
        for (String food:foods) {
            System.out.print(food + " ");
        }
        scanner.close();
    }
}
