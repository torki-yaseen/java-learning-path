package AnonymousClass;

public class Main {
    public static void main(String[] args) {
        /*
        Anonymous Class = A clas that doesn't have a name. Cannot be reused. Add custom behaviour without having to create a new class.
        Often used for one time uses (TimeTask, Runnable , callbacks)
         */
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Dog goes \" hello world! \"" );
            }
        };
        dog1.speak();
        dog2.speak();
    }
}
