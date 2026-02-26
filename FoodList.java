import java.util.ArrayList;
import java.util.Scanner;

public class FoodList {
    public static void main(String[] args) {
        // create a food list
        // declare variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>foods = new ArrayList<>();
        int numberOfItem;
        // ask user for inputs
        System.out.print("Enter # of food you wanted to include: ");
        numberOfItem = scanner.nextInt();
        scanner.nextLine();
        // create the logic
        for (int i=1; i<=numberOfItem; i++){
            System.out.print("Enter food #" + i +": ");
            String foodInput = scanner.nextLine();
            foods.add(foodInput);
        }
        System.out.println(foods);
        scanner.close();
    }
}
