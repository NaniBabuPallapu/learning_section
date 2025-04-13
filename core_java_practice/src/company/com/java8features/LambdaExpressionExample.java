package company.com.java8features;

import java.util.List;
import java.util.function.Supplier;

public class LambdaExpressionExample {
    public static void functionalInterfaceWithLambdaExp() {
        Supplier<String> supplier = () -> "Hello Nani";
        System.out.println(supplier.get());
    }

    public static void threadsWithLambdaExp() {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
        });
        thread.start();
    }

    public static void streamsWithLambdaExp() {
        List<String> names = List.of("Ankit", "Mahesh", "Suresh", "Nani", "Kumar");
        System.out.println("=== Printing In Reverse Order ====");
        names.stream().sorted((name1, name2) -> name2.compareTo(name1)).forEach(element -> System.out.println(element+" "));
    }

    public static void main(String[] args) {
        System.out.println("\n");
        functionalInterfaceWithLambdaExp();
        System.out.println("\n");

        threadsWithLambdaExp();
        System.out.println("\n");

        streamsWithLambdaExp();
        System.out.println("\n");
    }
}
