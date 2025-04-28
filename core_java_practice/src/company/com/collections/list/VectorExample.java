package company.com.collections.list;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Creating a vector of Strings
        Vector<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Inserting element at a specific position
        fruits.add(1, "Orange");

        // Displaying elements
        System.out.println("Fruits: " + fruits);

        // Accessing elements
        System.out.println("First Fruit: " + fruits.get(0));

        // Updating an element
        fruits.set(2, "Pineapple");
        System.out.println("Updated Fruits: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After Removing Banana: " + fruits);

        // Checking size and capacity
        System.out.println("Size: " + fruits.size());
        System.out.println("Capacity: " + fruits.capacity());

//        // Iterating using for-each loop
//        System.out.println("Iterating through Vector:");
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        // Checking if vector contains an element
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list");
        } else {
            System.out.println("Mango is not in the list");
        }
        System.out.println("Fruits before clear(): " + fruits);
        // Clearing the vector
        fruits.clear();
        System.out.println("Fruits after clear(): " + fruits);
    }

}
