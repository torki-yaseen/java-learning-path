public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void showTotal() {
        System.out.println("your friend total count is " + numberOfFriends);
    }
}