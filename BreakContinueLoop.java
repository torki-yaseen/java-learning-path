public class BreakContinueLoop {
    public static void main(String[] args) {
        /*
        break = break out of the loop stop
        continue = skip current iteration of loop skip
         */
        for(int i=1; i<10 ; i++){
            if (i ==5 || i == 8)
                continue;
            System.out.print(i +" ");
        }
    }
}

