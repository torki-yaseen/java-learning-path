import java.util.Scanner;
public class Banking {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Banking program with java
        // declare variables
        double balance =0;
        int choice;
        boolean isRunning = true;
        // show menu
        while (isRunning){
            System.out.println("*******************");
            System.out.println("Banking with Java!");
            System.out.println("*******************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.println("*******************");

            // get input from user and process his choices
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdrawal(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID INPUT");
            }
        }
        // exit
        System.out.println("*******************");
        System.out.println("Thanking you for banking with Java bank.");
        System.out.println("have a nice day!");
        System.out.println("*******************");

    }
    // showBalance()
    static void  showBalance(double balance){
        System.out.printf("Available balance : $%.2f \n", balance );
    }
    // deposit()
    static  double  deposit(){
        double amount;
        System.out.print("Enter an  deposit amount: ");
        amount = scanner.nextDouble();
        if (amount <0){
            System.out.println("Deposit amount can't be negative!");
            return 0;
        }else {
            System.out.printf("You had deposited $%.2f\n",amount);
            return amount;
        }
    }
    // withdrawal()
    static double withdrawal(double balance){
     double amount;
        System.out.print("Enter an amount to withdrawal: ");
        amount = scanner.nextDouble();
     if(amount > balance){
         System.out.println("Can't withdrawal amount greater than your balance");
         return 0;
         }else {
         System.out.printf("You had withdrawal $%.2f\n",amount);
         return amount;
     }
    }
}
