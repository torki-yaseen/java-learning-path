import java.util.Arrays;

public class $2D_Array {
    public static void main(String[] args) {
        // 2D array = an array where each element is an array , useful for storing a matrix of data
        // declare variables
        String fruits[] = {"apple","orange","pineapple","peach"};
        String vegetable[] = {"carrot","tomato","cucumber","onion"};
        String meat[]= {"lame","fish","beef","chicken"};

        Arrays.sort(fruits);Arrays.sort(vegetable);Arrays.sort(meat);
        String meal[][]={ fruits,vegetable , meat};

        //printing an array using a enhanced for
        for ( String []foods : meal){
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
