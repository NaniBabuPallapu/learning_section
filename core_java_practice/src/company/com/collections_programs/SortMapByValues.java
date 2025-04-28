package company.com.collections_programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 3);
        map.put("mango", 1);

/*        //option -1
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> map1, Map.Entry<String, Integer> map2) {
//                return Integer.compare(map1.getValue(), map2.getValue()) ;
                return map1.getValue().compareTo(map2.getValue());
            }
        };*/

        //option - 2
        Comparator<Map.Entry<String, Integer>> comparator = (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue());

        //option - 3
//        Comparator<Map.Entry<String,Integer>> comparator = Comparator.comparing(Map.Entry::getValue);

        //option - 4

//        Comparator<Map.Entry<String,Integer>> comparator = Map.Entry.comparingByValue();


        map.entrySet().stream()
                .sorted(comparator)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        System.out.println("\n");

        //option - 5
        map.entrySet()
                .stream()
//                .sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + "  " + entry.getValue()));
    }
}
