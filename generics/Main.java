package generics;

public class Main {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Product <String, Double> product = new Product<>("car", 90000.99);

        System.out.println(product.getPrice());
        System.out.println(product.getItem());

    }
}
