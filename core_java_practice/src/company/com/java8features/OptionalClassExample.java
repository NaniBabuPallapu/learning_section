package company.com.java8features;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Nani");

        // Check if value is present
        if (name.isPresent()) {
            System.out.println(name.get());
        }

        // orElse
        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElse("There is no "));

        // ifPresent
        name.ifPresent(n -> System.out.println("Hi " + n));
    }
}
