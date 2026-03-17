public class PassOrFail {
    public static void main(String []args){
        // ternery operator ? = return 1 of 2 value if a  condition is true
        // variable (condition) ? ifTrue : ifFalse;
        int score = 80;
        String success = (score >=51)? "Pass" : "fail" ;
        System.out.println(success);
    }
}
