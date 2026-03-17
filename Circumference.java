import java.util.Scanner;

public class Circumference {
    public static void main(String[]args){
        // circumference = 2 *Math.PI*radius
        // area = Math.PI *Math.pow(radius, 2)
        //volume = (4.0 /3.0)*Math.PI*Math.pow(radius, 3)

        double circumference , radius , area , volume;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius to calculate circle info::");
        radius = scanner.nextDouble();

        circumference = 2 *Math.PI*radius;
        area = Math.PI *Math.pow(radius, 2);
        volume = (4.0 /3.0)*Math.PI*Math.pow(radius, 3);
        System.out.printf("Circumference is :  %.2f cm" , circumference );
        System.out.printf("\narea is : %.2f cm² " , area );// fn alt 0178
        System.out.printf("\nvolume is : %.2f cm³ " , volume);// fn alt 0179
        scanner.close();


    }
}
