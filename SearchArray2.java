public class SearchArray2 {
    public static void main(String[] args) {
        // find a string from the array
        // declare variables
        String fruits[] = {"apple","orange","banana","pineapple"};
        String target = "watermelon";
        boolean isFound = false;
        // search and find the string using for and if
        for(int i =0; i< fruits.length;i++){
            if (target.equals(fruits[i])){
                isFound =true;
                System.out.println("Your fruits found in place number "+ i);
            }
        }
        if (!isFound){
            System.out.println("your fruit did not found!");
        }
    }
}
