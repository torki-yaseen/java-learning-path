import java.util.Scanner;

public class HypotenuseTriangle {
    public static void main(String[]args){
        // hypotenuse c = Math.sqrt(a² + b²)
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of side a : ");
        a = scanner.nextDouble();
        System.out.print("Enter length of side b : ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hypotenuse of triangle (side c)  is : " + c + " cm²");

        scanner.close();
    }
}
