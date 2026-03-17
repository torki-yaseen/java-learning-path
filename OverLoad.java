public class OverLoad {
    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        String pizza = bakePizza("flat", "mozzarella","pepperoni");
        System.out.println(pizza);
    }
    static double add ( double a , double b){
        return a+b;
    }
    static double add ( double a, double b , double c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread , String cheese){
        return bread + " " + cheese + " pizza";
    }
    static String bakePizza(String bread, String cheese , String topping){
        return bread + " " + cheese + " " + topping + " pizza";
    }

}
