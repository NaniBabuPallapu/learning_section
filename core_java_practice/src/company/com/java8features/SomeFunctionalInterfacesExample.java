package company.com.java8features;

import java.util.function.*;

public class SomeFunctionalInterfacesExample {
    public static void supplierExample() {
        Supplier<String> supplier = () -> "Nani Babu";
        Supplier<Integer> integerSupplier = () -> 26;
        System.out.println("I am " + supplier.get() + ". My Age is " + integerSupplier.get());
    }

    public static void functionExample() {
        Function<String, Integer> function = name -> name.length();
        System.out.println("Length Of Given Name : " + function.apply("Nani Babu"));
    }

    public static void biFunctionExample() {
        BiFunction<Integer, Double, Boolean> biFunction = (value1, value2) -> value1 > value2;
        System.out.println(biFunction.apply(5,4.5));
    }
    public static void unaryOperatorExample(){
        UnaryOperator<Integer> unaryOperator = value -> value * value;
        System.out.println(unaryOperator.apply(5));
    }
    public static void binaryOperator(){
        BinaryOperator<Integer> binaryOperator = (value1, value2) -> value1 * value2;
        System.out.println(binaryOperator.apply(3, 2));
    }

    public static void predicateExample(){
        Predicate<Integer> predicate = value -> value % 2 == 0; // checking even or odd number which returns boolean and takes input as Integer
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(9));
    }
    public static void consumerExample(){
        Consumer<String> consumer = (name) -> System.out.println("Hello "+name);
        consumer.accept("Nani Babu");
    }
    public static void biConsumerExample(){
        BiConsumer<String, Integer> biConsumer = (value1, value2) -> System.out.println("I am "+value1+". My age is : "+value2);
        biConsumer.accept("Nani Babu", 26);
    }

    public static void main(String[] args) {
        System.out.println("\n");
        supplierExample();
        System.out.println("\n");

        functionExample();
        System.out.println("\n");

        biFunctionExample();
        System.out.println("\n");

        unaryOperatorExample();
        System.out.println("\n");

        binaryOperator();
        System.out.println("\n");

        predicateExample();
        System.out.println("\n");

        consumerExample();
        System.out.println("\n");

        biConsumerExample();
        System.out.println("\n");

    }
}
