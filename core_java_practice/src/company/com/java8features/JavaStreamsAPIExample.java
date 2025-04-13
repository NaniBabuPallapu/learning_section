package company.com.java8features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsAPIExample {
    //forEach() : print each element
    public static void demonstrateForEach(List<Integer> numbers) {
        numbers.stream().forEach((element -> System.out.print(element + " ")));
    }

    // map(): Transform elements (square)
    public static void demonstrateMap(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .map(element -> element * element)
                .collect(Collectors.toList());

        System.out.println("Squares List : " + result);
    }

    // filter(): Filter even numbers
    public static void demonstrateFilter(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers Only : " + evenNumbers);
    }

    // sorted(): Sort elements
    public static void demonstrateSorted(List<Integer> numbers) {
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted List In Ascending Order : " + sortedList);
    }

    // distinct(): Remove duplicates
    public static void demonstrateDistinct(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Removed Duplicates From List : " + result);
    }

    // limit(): Limit to first 3 elements
    public static void demonstrateLimit(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .limit(3)
                .toList();
        System.out.println("Limited Element From List : " + result);
    }

    // skip(): Skip first 2 elements
    public static void demonstrateSkip(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .skip(4)
                .toList();
        System.out.println("Skipped First 3 Elements From List : " + result);
    }

    // reduce(): Multiple With 2 each element in List.
    public static void demonstrateReduce(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        int doubleAndSum = numbers.stream()
                .map(element -> element * 2)
                .reduce(0, Integer::sum);

        System.out.println("Sum = " + (sum));
        System.out.println("Double Each Element In List and Sum Them All : " + doubleAndSum);
    }

    // collect(): Collect elements to List
    public static void demonstrateCollect(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .collect(Collectors.toList());
        System.out.println("Result : " + result);
    }

    // toArray(): Convert stream to array
    public static void demonstrateToArray(List<Integer> numbers) {
        Integer[] array = numbers.stream()
                .toArray(size -> new Integer[size]);
        //  Integer[] array = numbers.stream().toArray(Integer[]::new);
        System.out.println("Converted From List of Integers into Integer Array : " + Arrays.toString(array));

    }

    public static void demonstrateCount(List<Integer> numbers) {
        long total = numbers.stream()
                .count();
        System.out.println("Total Elements : " + total);
    }

    // anyMatch(): Any element > 50?
    public static void demonstrateAnyMatch(List<Integer> numbers) {
        boolean check = numbers.stream().anyMatch(element -> element > 25);
        System.out.println(check ? "Yes. There is a element in the list which is more 25" : "No. There is no such element exist which is more than 25");
    }

    // allMatch(): All elements in the list more than 10?
    public static void demonstrateAllMatch(List<Integer> numbers) {
        boolean check = numbers.stream()
                .allMatch(elements -> elements > 10);
        System.out.println(check ? "Yes" : "No");
    }

    // noneMatch(): No negative numbers?
    public static void demonstrateNoneMatch(List<Integer> numbers) {
        boolean result = numbers.stream().noneMatch(n -> n > 0);
        System.out.println(result ? "List Has No Negative Numbers" : "List Has Negative Numbers");
    }

    // findFirst(): Get first element
    public static void demonstrateFindFirst(List<Integer> numbers) {
        Optional<Integer> result = numbers.stream().findFirst();
        result.ifPresent(System.out::println); //        System.out.println(result.orElse(null));
    }

    // findAny(): Get any element (parallel-friendly)
    public static void demonstrateFindAny(List<Integer> numbers) {
        Optional<Integer> result = numbers.stream().findAny();
        result.ifPresent(System.out::println);
    }

    // peek(): Debug intermediate operation
    // peek() is an intermediate operation that returns a stream consisting of the elements of the original stream, and also performs a provided action on each element.
    public static void demonstratePeek(List<Integer> numbers) {
        System.out.println("peek - Debug processing:");
        List<Integer> result = numbers.stream()
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Result: " + result + "\n");
    }

    // flatMap(): Flatten nested collections
    public static void demonstrateFlatMap() {
        System.out.println("flatMap - Flatten list of lists:");
        List<List<String>> data = Arrays.asList(
                Arrays.asList("Nani", "Kumar"),
                Arrays.asList("Suresh", "Mahesh")
        );

        List<String> namesList = data.stream()
                .flatMap(List::stream) // flatMap(list -> list.stream()) or flatMap(Collection :: stream)
                .toList();
        System.out.println("Combined List Names : " + namesList);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 17, 20, 15, 16, 11, 13, 18, 12, 17, 13, 14, 19);
        //Stream Creation
        Stream<Integer> stream = numbers.stream();
        System.out.println("\n");

        demonstrateForEach(numbers);
        System.out.println("\n");

        demonstrateMap(numbers);
        System.out.println("\n");

        demonstrateFilter(numbers);
        System.out.println("\n");

        demonstrateSorted(numbers);
        System.out.println("\n");

        demonstrateDistinct(numbers);
        System.out.println("\n");

        demonstrateLimit(numbers);
        System.out.println("\n");

        demonstrateSkip(numbers);
        System.out.println("\n");

        demonstrateReduce(numbers);
        System.out.println("\n");

        demonstrateCollect(numbers);
        System.out.println("\n");

        demonstrateToArray(numbers);
        System.out.println("\n");

        demonstrateCount(numbers);
        System.out.println("\n");

        demonstrateAnyMatch(numbers);
        System.out.println("\n");

        demonstrateAllMatch(numbers);
        System.out.println("\n");

        demonstrateFindFirst(numbers);
        System.out.println("\n");

        demonstrateFindAny(numbers);
        System.out.println("\n");

        demonstratePeek(numbers);
        System.out.println("\n");

        demonstrateFlatMap(); // uses a separate List<List<String>>
        System.out.println("\n");


    }

}
