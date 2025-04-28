package company.com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void hashSetExample() {

        // HashSet: does not maintain insertion order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Nani");
        hashSet.add("Thor");
        hashSet.add("Thanos");
        hashSet.add("Tony Stark");
        hashSet.add("Doctor Strange");
        hashSet.add("Steve Rogers");
        hashSet.add("Thanos"); // Duplicate element, will not be added
        hashSet.add(null);
        hashSet.add(null); // Duplicate null also, will not be added
        System.out.println(hashSet);
        // Checking if an element exists
        System.out.println("Contains 'Thor': " + hashSet.contains("Thor"));


    }

    public static void linkedHashSetExample() {

        // LinkedHashSet: it maintains insertion order
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Nani");
        linkedHashSet.add("Thor");
        linkedHashSet.add("Thanos");
        linkedHashSet.add("Tony Stark");
        linkedHashSet.add("Doctor Strange");
        linkedHashSet.add("Steve Rogers");
        linkedHashSet.add("Thanos"); // Duplicate element, will not be added
        linkedHashSet.add(null);
        linkedHashSet.add(null); // Duplicate null also, will not be added
        System.out.println(linkedHashSet);
        // Checking if an element exists
        System.out.println("Contains 'Thor': " + linkedHashSet.contains("Thor"));

    }

    public static void treeSetExample() {

        // TreeSet: it maintains natural sorting order
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Nani");
        treeSet.add("Thor");
        treeSet.add("Thanos");
        treeSet.add("Tony Stark");
        treeSet.add("Doctor Strange");
        treeSet.add("Steve Rogers");
        treeSet.add("Thanos"); // Duplicate element, will not be added
//        treeSet.add(null); // null values are not allowed
        System.out.println(treeSet);
        // Checking if an element exists
        System.out.println("Contains 'Thor': " + treeSet.contains("Thor"));

    }

    public static void main(String[] args) {
        System.out.println("\n HashSet Example : ");
        hashSetExample();

        System.out.println("\n LinkedHashSet Example : ");
        linkedHashSetExample();


        System.out.println("\n TreeSetExample : ");
        treeSetExample();

    }
}
