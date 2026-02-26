import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLesson {
    public static void main(String[] args) {
       /*
        Arraylist = A resizable array that stores objects(autoboxing) Arrays are fixed in size, but ArrayLists can change 
         */
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        System.out.println(list1);

        ArrayList<Double>list2 = new ArrayList<>();
        list2.add(2.2);
        list2.add(2.5);
        list2.add(4.4);
        System.out.println(list2);

        ArrayList<String>list3 = new ArrayList<>();
        list3.add("apple");
        list3.add("orange");
        list3.add("watermelon");
        list3.remove(2);// to remove element
        list3.set(0,"pineapple");// to modify an element
        System.out.println(list3);
        list3.add("apple");
        list3.add("gauava");

        System.out.println(list3.get(0));// to print an element
        System.out.println(list3.size());// to get it size
        Collections.sort(list3); // to sort the Arraylist
        System.out.println(list3);
        // we can also use the enhanced loop
        for (String list: list3){
            System.out.println(list);
        }

    }
}

