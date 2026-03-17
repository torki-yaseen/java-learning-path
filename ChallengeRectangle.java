import java.util.Scanner;

public class ChallengeRectangle {
    public static void main(String[]args){
        // Calculate rectangle area
        Scanner scanner = new Scanner(System.in);
        double height = 0;
        double width = 0;

        System.out.println("Enter the height and width  to calculate the area of rectangle: ");
        height = scanner.nextDouble();
        width = scanner.nextDouble();
        double area = height * width ;
        System.out.println("area of your rectangle is : "+ area + " cm²"); // fn alt 0178 to make the ²
        scanner.close();
    }
}
