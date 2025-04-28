package company.com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Nani");
        names.add("Thor");
        names.add("Thanos");
        names.add("Tony Stark");
        names.add("Doctor Strange");
        names.add("Steve Rogers");
        System.out.println("Linked List : " + names + " size : " + names.size());
        System.out.println("First Name In List : " + names.get(0));
        names.remove("Thanos");
        System.out.println("LinkedList after removing thanos : " + names);
        boolean check = names.contains("Peter Parker");
        System.out.println("Does names list contain peter parker : " + (check ? "Yes" : "No"));
        names.removeFirst();
        System.out.println("Removing First Element Nani");
        names.addFirst("Peter Parker");
        names.add(3,"Bruce Banner");
        System.out.println("LinkedList after adding bruce banner : " + names);
        System.out.println("added Peter Parker at first");
        Collections.sort(names);
        System.out.println("Sorted names : " + names);

    }
}
