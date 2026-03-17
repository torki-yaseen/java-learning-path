import java.util.Random;
public class Randoom {
    public static void main(String[]args){
        // create random number from 1 to 100
        Random random = new Random();

        int number1 = random.nextInt(1,101);
        int number2 = random.nextInt(1,101);
        int number3 = random.nextInt(1,101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double number4 = random.nextDouble();
        System.out.println(number4);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("Heads");
        }else {
            System.out.println("Tales");
        }


    }
}
