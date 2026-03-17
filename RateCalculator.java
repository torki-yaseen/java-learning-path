import java.util.Scanner;

public class RateCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double principle , InterestRate , CompoundingFrequancy , Result , Time ;
        System.out.print("Enter principle: ");
        principle = scanner.nextDouble();
        System.out.print("Enter Interest rate %: ");
        InterestRate = (scanner.nextDouble())/100;
        System.out.print("Enter compounding times :");
        CompoundingFrequancy = scanner.nextDouble();
        System.out.print("Enter number of year: ");
        Time = scanner.nextDouble();
        /* A = p*(1+(r/n))^nt
            (A=P*(1+{r/n})^{nt})
         */
        Result = principle * Math.pow(1+(InterestRate/CompoundingFrequancy), (CompoundingFrequancy*Time));
        System.out.printf("\nYour fund  %.2f$ will be equal to : %.2f$ after %.1f Years.  \n", principle , Result , Time);
        scanner.close();
    }
}
