public class User {
    String userName;
    String email;
    int age;

    User(){
        this.userName = "Guest";
        this.email = "Not found";
        this.age =0;
    }
    User(String userName){
        this.userName = userName;
        this.email = "Not found";
        this.age =0;
    }
    User(String userName, String email){
        this.userName = userName;
        this.email = email;
        this.age =0;
    }
    User(String userName, String email, int age){
        this.userName = userName;
        this.email = email;
        this.age =age;
    }
}
