public class variables {
    public static void main(String[] args) {
        int age = 39;
        int year = 2026;
        int car = 3;

        double price = 13.99;
        double gpa = 3.5;

        char currency ='$';
        char grade ='A';

        boolean isOnline = true;
        boolean isStudent = false;
        boolean forSale = true;

        if (isStudent){
            System.out.println("You're student");
        }else {
            System.out.println("You're not a student");
        }
        String name = "blue";
        String food ="pizza";
        String email ="fake123@gmail.com";
        System.out.println("hello "+ name);
        System.out.println("you are " + age+ " years old");
        System.out.println("your gpa " + gpa );
        System.out.println("your average grade "+ grade);
        if (forSale){
            System.out.println("There are "+ car + " for sale");
        }else {
            System.out.println("There are no car for sale ");
        }
    }
}
