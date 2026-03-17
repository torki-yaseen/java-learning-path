public class Arithmetic {
    public static void main(String[]args){
        int x =10;
        int y = 20;
        int z ;
        z = x+y;
        z = x-y;
        z = x*y;
        z = x/y;
        z = x%y;
        // augmented operators
        //x = x+y;
        x +=y;
        x -=y;
        System.out.println(z);
        System.out.println(x);
        // increment & decrement
        y ++;
        y --;
        System.out.println(y);
        // order of operation (p e m d a s)
        double result = 3+4 * 5*(4-2) / 2.0;
        System.out.println(result);
    }

}
