public class Wrapper {
    public static void main(String[] args) {
        /*
        Wrapper classes = Allow primitive values (int,char,double,boolean) to be used as objects. "Wrap them in an object Generally, don't wrap primitives unless you need an object.
        Allows use of collections Framework and static Utility methods.
         */
    // autoboxing
        Integer a =123;
        Double b = 123.12;
        Character c = 'L';
        Boolean d = true;
        String e = "Hello";

        // unboxing
        int x = a;
        // converting primitive to reference type
        String a1 = Integer.toString(a);
        String b1 = Double.toString(b);
        String c1 = Character.toString(c);
        String d1 = Boolean.toString(d);

        System.out.println(a1+b1+c1+d1);

        // converting reference type to primitive
        int a2 = Integer.parseInt(a1);
        double b2= Double.parseDouble(b1);
        char c2 = c1.charAt(0);// is not a wrapper class but that the method
        boolean d2 = Boolean.parseBoolean(d1);

        // other useful wrapper classes
        char letter ='a';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
