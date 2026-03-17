import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[]args){
        // declare variables and declare a scanner
        /*
        celsius = (fahrenheit -32) / 1.8
        fahrenheit = (celsius *1.8) +32
         */
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        // ask for input Celsius to Fahrenheit
        System.out.print("Enter the temperature:");
        temp = scanner.nextDouble();
        System.out.print("Convert temperature to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        // logic of the converter user ternary
        newTemp= (unit.equals("C"))? (temp - 32)*1.8 : (temp *1.8)+32;
        // find the reverse unit
         String originalUnit = (originalUnit= unit.equals("C") ? "F" : "C");
        // return the answers
        System.out.printf("%.1f°%s is equivalent of  %.1f°%s ", temp ,originalUnit , newTemp,unit);
        scanner.close();
    }
}
