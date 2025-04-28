package company.com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nani");
        names.add("Thor");
        names.add("Thanos");
        names.add("Tony Stark");
        names.add("Doctor Strange");
        names.add("Steve Rogers");
//        names.add(null); // null is allowed in list
        System.out.println("ArrayList : " + names+" size : "+names.size());
        System.out.println("First Name In List : " + names.get(0));
        names.remove("Thanos");
        System.out.println("ArrayList after removing thanos : " + names);
        boolean check = names.contains("Peter Parker");
        System.out.println("Does names list contain peter parker : " + (check ? "Yes" : "No"));
        Collections.sort(names);
        System.out.println("Sorted names : " + names);

    }
}
