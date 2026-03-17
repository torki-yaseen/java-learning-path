public class $2D_Array2 {
    public static void main(String[] args) {
        // print a dial-pad similar to the one in a mobile phone
        char dialPad[][] = {{'1', '2', '3'},
                            {'4', '5', '6'},
                            {'7', '8', '9'},
                            {'*', '0', '#'}};
        for (char[] rows : dialPad){
            for (char row : rows) {
                System.out.print(row + " ");
             }
             System.out.println();
        }
    }
}