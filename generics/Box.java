package generics;

public class Box <T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }

    public static class Product <T, U>{
        T item;
        U price;

        Product(T item , U price){
            this.item= item;
            this.price = price;
        }
        public U getPrice(){
            return this.price;
        }
        public T getItem(){
            return this.item;
        }
    }
}
