package company.com.streams_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleProgram {
    public static void main(String[] args) {
        System.out.println("Welcome To Java World!");

        List<String> words = Arrays.asList("hello", "java", "streams");

        words = words.stream()
                .map(element -> element.toUpperCase())
                .toList();
        System.out.println("Convert List of Strings to Uppercase" + words);

        List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 3, 4);

        numbers = numbers.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Event Numbers From List" + numbers);


        List<String> list = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");

        int value = (int) list.stream()
                .filter(element -> element.startsWith("a"))
                .count();
        System.out.println("Count Words Starting with 'A'" + value);

        List<Integer> values = Arrays.asList(1, 2, 5, 6, 3, 4);
        int maximum = values.stream()
                .max((element1, element2) -> Integer.compare(element1, element2)).orElseThrow();
        System.out.println("maximum element " + maximum);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //[1, 2, 3, 4, 5]
        //Expected Output:
        //Sum: 20 (since 2² + 4² = 4 + 16 = 20)
        long sum = list1.stream()
                .filter(element -> element % 2 == 0)
                .map(element -> element * element)
//                                        .reduce(0,(value1, value2) -> value1+value2);
//                .reduce(0, (value1, value2) -> Integer.sum(value1,value2));
                .reduce(0, Integer::sum);

        System.out.println("Sum of Squares of Even Numbers");

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        List<Integer> reducedListOfList = nestedList.stream()
                .flatMap(reducedList -> reducedList.stream())
                .collect(Collectors.toList());
        System.out.println("Reduced List using flatMap" + reducedListOfList);

        List<Integer> giveNumbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        //Given a list, skip the first 2 elements and print the next 3.
        List<Integer> result = giveNumbers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Example Of Skip and Limit " + result);


        List<Integer> numerList = Arrays.asList(1, 2, 3);

        List<Integer> fetchedResult = numerList.stream()
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Example Of Peek()" + fetchedResult);




    }

}
