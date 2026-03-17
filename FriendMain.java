public class FriendMain {
    public static void main(String[] args) {

        Friend friend1 = new Friend("ali");
        Friend friend2 = new Friend("samir");
        Friend friend3 = new Friend("ramzi");
        Friend friend4 = new Friend("zaki");

        System.out.println(Friend.numberOfFriends);
        Friend.showTotal();

    }
}
