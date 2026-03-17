import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        String []fruits ={"apple","orange","banana","pinapple","jawava","watermelon"};
        Arrays.sort(fruits);
//        Arrays.fill(fruits,"orange");
        for (int i=0; i< fruits.length;i++){
            System.out.print(fruits[i] +" ");
        }
        System.out.println();
        for (String fruit : fruits){
            System.out.print(fruit+ " ");
        }
    }
}
