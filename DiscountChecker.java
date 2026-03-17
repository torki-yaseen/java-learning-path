public class DiscountChecker {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                price *= 0.7;
                System.out.printf("Price for ticket is %.2f $ after a discount of 30%%", price);
            } else {
                price *= 0.9;
                System.out.printf("Price for ticket is %.2f $ after a discount of 10%%", price);
            }
        } else {
            if (isSenior) {
                price *= 0.8;
                System.out.printf("Price for ticket is %.2f $ after a discount of 20%%", price);
            } else {
                price *= 1;
                System.out.printf("Price for ticket is %.2f $", price);
            }
        }
    }
}
