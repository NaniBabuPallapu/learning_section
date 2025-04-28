package company.com.streams_programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesAndFirstNonRepeating {
    public static void main(String[] args) {
        System.out.println("=== I AM THE STRONGEST AVENGER ON THE EARTH ===");

//        (1, 2, 2, 3, 4, 4, 4, 5);get only the duplicate integers in a list Output: [2, 4]

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);

        list = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);

        String str = "nnnaaaniagat";

        // find first non-repeating character - i
       /*  way 1

       char[] charArray = str.toCharArray();

        List<Character> characters = new ArrayList<>();
        for (char ch : charArray) {
            characters.add(ch);
        }


        Map<Character, Long> map = characters.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Character, Long> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }

        */


        // way - 2
        Optional<Character> ch = str.chars()
                .mapToObj(element -> (char) element)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst();
        System.out.println(ch.orElseThrow());


        LocalDate birthDate = LocalDate.of(1999, 2, 9);
        Period age = Period.between(birthDate, LocalDate.now());
        System.out.println("Age: " + age.getYears()+" "+age.getMonths()+" "+age.getDays());

        Arrays.asList("A", "B", "C", "D", "E")
                .parallelStream() // Parallel streams divide the source into multiple parts and process them **concurrently using multiple threads**.
                .forEach(s -> System.out.print(s + " ")); // Parallel C E D B A

    }
}
