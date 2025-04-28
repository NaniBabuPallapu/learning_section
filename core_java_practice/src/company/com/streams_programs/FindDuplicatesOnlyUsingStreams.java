package company.com.streams_programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesOnlyUsingStreams {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "grape", "avocado", "lime", "apple", "orange", "banana");

        // way : 1
        Map<String, Long> valueAndCount = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(valueAndCount); // item and it's frequency


        for (Map.Entry<String, Long> item : valueAndCount.entrySet()) {
//            System.out.println(item.getKey() + " = " + item.getValue());
            if (item.getValue() > 1) {
                System.out.println(item.getKey());
            }
        }

        System.out.println("\n");


        // way : 2
        Set<String> duplicates = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey) // .map(map -> map.getKey())
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
