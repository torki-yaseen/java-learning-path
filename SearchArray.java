public class SearchArray {
    public static void main(String[] args) {
        // create a way to find element in array
        // declare variables
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int target = 11;
        boolean isFound = false;
        // for loop and finding with if
        for (int i=0; i<numbers.length;i++){
            if (target == numbers[i]){
                isFound = true;
                System.out.println("number found at " + i);
            }
        }
        if (!isFound){
            System.out.println("Number could not be found in the array.");
        }
    }
}
