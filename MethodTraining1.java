public class MethodTraining1 {
    public static void main(String[] args) {
        happyBirth("hassona",1);
        happyBirth("lolo",3);
        System.out.println(square(2));
        System.out.println(cube(3));
        System.out.println(getFullName("hassan","torki"));

        int age = 15;
        if (getCheck(age)) {
            System.out.println("You can sign in!");
        }else{
            System.out.println("You must be 18+ to sign in!");
        }

    }
    static void happyBirth(String name, int age){
        System.out.println("Happy birth to you.");
        System.out.printf("Happy birth to you , dear. %s\n",name);
        System.out.println("Happy birth to you.");
        System.out.printf("You have %d years old.\n",age);
        System.out.println();
    }
    static double square(double number){
        return number * number;
    }
    static double cube (double number){
        return number * number * number;
    }
    static String getFullName(String first , String last){
        return first + " "  + last;
    }
    static boolean getCheck(int age){
        if (age >= 18){
            return true;
        }else
            return false;
    }
}
