import java.util.Scanner;

public class MatricesSymbol {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        char symbol;
        System.out.print("Enter # of row: ");
        row = scanner.nextInt();
        System.out.print("Enter # of column: ");
        column = scanner.nextInt();
        System.out.print("Enter symbol: ");
        symbol = scanner.next().charAt(0);
        for (int i =0; i< row ; i++){
            Thread.sleep(1000);
            for (int j = 0; j < column ; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
        }
    }

