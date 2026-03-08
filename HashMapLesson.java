import java.util.HashMap;

public class HashMapLesson {
    public static void main(String[] args) {
        /*
        HashMap = A Data structure that stores key-value pairs 
        Keys are unique, but Values can be duplicated 
        Does not maintain any order, but is memory efficient 
        HashMap<Key, Value>
         */
        HashMap<String, Double> map = new HashMap<>();

        map.put("orange",3.99);
        map.put("apple",5.99);
        map.put("banana",1.99);
        map.put("banana",0.99); // that will Override the first input
        //map.remove("apple");// to remove it
        System.out.println(map);
        // to get the value of the key only
        System.out.println(map.get("apple"));
        // to check it there is a value of a key
        System.out.println(map.containsKey("banana"));
        // if the key had a certain value
        System.out.println(map.containsValue(0.99));
        // check the size
        System.out.println("get the size of the map "+map.size());
        // in practice
        if (map.containsKey("watermelon")){
            System.out.println(map.get("apple"));
        }else {
            System.out.println("key not found");
        }
        // to print all the prices ex. in the HashMap

        for (String key : map.keySet()){
            System.out.println(key + ": $"+ map.get(key));
        }
    }
}

