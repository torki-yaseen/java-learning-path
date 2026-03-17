import java.util.Scanner;

public class ExplainSubString {
    public static void main(String[]args){
        //       Substring used to extract a portion of a String
        // example of username extractor

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if(email.contains("@")){
            String userName  = email.substring(0,email.indexOf("@"));
            String domine = email.substring(email.indexOf("@")+1);

            System.out.println("user name : " + userName);
            System.out.println("domine : " + domine);
        }else {
            System.out.println("Enter a valid email.");
        }
        scanner.close();
    }
}
