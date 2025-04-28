package company.com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void hashMapExample() {
        System.out.println("HashMap Example :");
        HashMap<Integer, String> hashMap = new HashMap<>();

        // put() - add or update key-value pair
        // it does not maintain sorted order or insertion order
        hashMap.put(11, "Peter Parker");
        hashMap.put(1, "Nani");
        hashMap.put(5, "Tony Stark");
        hashMap.put(13, "Thanos");
        hashMap.put(2, "Thor");
        hashMap.put(null, null);  // One null key allowed
        hashMap.put(17, null); // Null values allowed
        hashMap.put(6, "Doctor Strange");
        hashMap.put(5, "Steve Rogers"); // Overwrites value

        System.out.println(hashMap);
        // get()
        System.out.println("Get 'Doctor Strange': " + hashMap.get(6));

        // containsKey()
        System.out.println("Contains key '2': " + hashMap.containsKey(2));


        // containsValue()
        System.out.println("Contains value 'Thanos': " + hashMap.containsValue("Thanos"));

        // getOrDefault() : It helps you retrieve a value from the map, but if the key is not present, it returns a default value instead of null
        System.out.println(hashMap.getOrDefault(2, "Default Hero")); // Output: Thor
        System.out.println(hashMap.getOrDefault(3, "Default Hero")); // Output: Default Hero

        for (Map.Entry<Integer, String> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }

    public static void linkedHashMap() {
        System.out.println("LinkedHashMap Example :");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // put() - add or update key-value pair
        // it maintains insertion order
        linkedHashMap.put(11, "Peter Parker");
        linkedHashMap.put(1, "Nani");
        linkedHashMap.put(5, "Tony Stark");
        linkedHashMap.put(13, "Thanos");
        linkedHashMap.put(2, "Thor");
        linkedHashMap.put(null, null);  // One null key allowed
        linkedHashMap.put(17, null); // Null values allowed
        linkedHashMap.put(6, "Doctor Strange");
        linkedHashMap.put(5, "Steve Rogers"); // Overwrites value

        System.out.println(linkedHashMap);
        // get()
        System.out.println("Get 'Doctor Strange': " + linkedHashMap.get(6));

        // containsKey()
        System.out.println("Contains key '2': " + linkedHashMap.containsKey(2));


        // containsValue()
        System.out.println("Contains value 'Thanos': " + linkedHashMap.containsValue("Thanos"));

        // getOrDefault() : It helps you retrieve a value from the map, but if the key is not present, it returns a default value instead of null
        System.out.println(linkedHashMap.getOrDefault(2, "Default Hero")); // Output: Thor
        System.out.println(linkedHashMap.getOrDefault(3, "Default Hero")); // Output: Default Hero


        for(Map.Entry<Integer, String> map : linkedHashMap.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }

    public static void treeMap() {
        System.out.println("TreeMap Example :");
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // put() - add or update key-value pair
        // it maintains sorted ascending  order
        treeMap.put(11, "Peter Parker");
        treeMap.put(1, "Nani");
        treeMap.put(5, "Tony Stark");
        treeMap.put(13, "Thanos");
        treeMap.put(2, "Thor");
//        treeMap.put(null, null);  // null key is not allowed
        treeMap.put(17, null); // Null values allowed
        treeMap.put(6, "Doctor Strange");
        treeMap.put(5, "Steve Rogers"); // Overwrites value

        System.out.println(treeMap);
        // get()
        System.out.println("Get 'Doctor Strange': " + treeMap.get(6));

        // containsKey()
        System.out.println("Contains key '2': " + treeMap.containsKey(2));


        // containsValue()
        System.out.println("Contains value 'Thanos': " + treeMap.containsValue("Thanos"));

        // getOrDefault() : It helps you retrieve a value from the map, but if the key is not present, it returns a default value instead of null
        System.out.println(treeMap.getOrDefault(2, "Default Hero")); // Output: Thor
        System.out.println(treeMap.getOrDefault(3, "Default Hero")); // Output: Default Hero


        for(Map.Entry<Integer, String> map : treeMap.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("\n HashMap Example : ");
        hashMapExample();

        System.out.println("\n LinkedHashMap Example : ");
        linkedHashMap();


        System.out.println("\n TreeMap Example : ");
        treeMap();
    }
}
