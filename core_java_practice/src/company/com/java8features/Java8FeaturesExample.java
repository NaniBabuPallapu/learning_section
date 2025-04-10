package company.com.java8features;

import java.util.List;

@FunctionalInterface
interface FunctionalInterfaceExample {

    void sayHello(String name);

    default void start() {
        System.out.println("=== Starting ===");
    }
    default void start2() {
        System.out.println("=== Started ===");
    }

    static void end() {
        System.out.println("=== Ending ===");
    }

    static void end2() {
        System.out.println("=== Ended ===");
    }
}

public class Java8FeaturesExample {
    public static void lambdaExpression(List<String> names) {
        names.forEach(name -> System.out.println("Welcome " + name));
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Lambda Expression ===");
        List<String> names = List.of("Nani", "Rajesh", "Mahesh", "Suresh");
        lambdaExpression(names);

        System.out.println("\n");
        System.out.println("\n");


        System.out.println("=== 2. Functional Interface Example ===");
        FunctionalInterfaceExample functionalInterfaceExample = (name) -> System.out.println("Hello "+name+". Welcome To Java World");
        functionalInterfaceExample.start();
        functionalInterfaceExample.start2();
        functionalInterfaceExample.sayHello("Nani");
        FunctionalInterfaceExample.end();
        FunctionalInterfaceExample.end2();

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("=== Functional Interface Example Using  Anonymous class ===");
        FunctionalInterfaceExample functional = new FunctionalInterfaceExample(){
            @Override
            public void sayHello(String name){
                System.out.println("Hello "+name);
            }
        };
        functional.sayHello("Nani Babu");

        System.out.println("\n");
        System.out.println("\n");


    }
}
