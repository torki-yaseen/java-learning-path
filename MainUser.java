public class MainUser {
    public static void main(String[] args) {
        /*
        overloaded constructor = allow class to have multiple constructor. with different parameter list. Enable object to be initialized in various ways.
         */
        User user1 = new User();
        User user2 = new User("Mosa");
        User user3 = new User("Essa","essa@google.com",22);
        User user4 = new User("Ibrahim", "ebrahim@sunset.com",39);

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println("**********************");
        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println("**********************");

        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println("**********************");

        System.out.println(user4.userName);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println("**********************");

    }
}
