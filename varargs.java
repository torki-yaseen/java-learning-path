public class varargs {
    public static void main(String[] args) {
        // varargs = allow methods to accept varying number of arguments makes methods more flexible. no need to overload methods java will pack the arguments in array ellipsis

        System.out.println(add(1,2,4,4,6,7,8,9,5));
        System.out.println(average(1,23,5,8,4,6,8,8,5,4));
    }
    static int add (int ... numbers){
        int sum =0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
    static double average (int ... numbers){
        double sum =0;
        // to make sure we are not dividing by zero
        if (numbers.length ==0)
            return 0;
        for (double number : numbers){
            sum += number;
        }
        return sum / numbers.length; // to find the number of participant in average equation
    }
}
