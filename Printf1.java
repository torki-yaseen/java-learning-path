public class Printf1 {
    public static void main(String[]args){
        // printf() is a method used to format output

        // % [flags] [width] [.precision] [specifier-character]

        // [specifier-character]

        String name = "SpongeBob";
        char nickName ='S';
        int age = 39;
        double height = 4.5;
        boolean isEmployed = true;
        System.out.printf("His name is %s", name);
        System.out.printf("\nnickname is %c\n" , nickName);
        System.out.printf("his height is %f and if he is employed the answer will be %b",height , isEmployed);
        // [.precision]
        double price1 = 9.9999;
        double price2 = 100.33;
        double price3 = -540000.10;

        System.out.printf("prices are %f ,  %f and %f" , price1, price2 , price3);
        System.out.printf("\nprices %.2f", price1);
        System.out.printf("\nprices %+.2f", price1);
        System.out.printf("\nprices %(,+.2f", price3);// ( to include () for negative number
        System.out.printf("\nprice % .2f",price1);// space
        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        int d1=1;
        int d2=12;
        int d3=123;
        int d4=1234;

        System.out.printf("\n%4d\n",d1);
        System.out.printf("%4d\n",d2);
        System.out.printf("%4d\n",d3);
        System.out.printf("%4d\n",d4);


    }
}
