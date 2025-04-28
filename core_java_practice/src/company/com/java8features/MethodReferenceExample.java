package company.com.java8features;

import java.util.function.Supplier;

class Bank {
    public static String balance() {
        return "User Balance : " + 1000;
    }

    public String withdraw() {
        return "WithDraw By User :" + 500;
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {


        // 1. Static method reference (ClassName::staticMethod)
        Supplier<String> balanceSupplier = Bank::balance;
        System.out.println(balanceSupplier.get()); // Output: User Balance : 1000

        // 2. Instance method reference on an object (object::instanceMethod)
        Bank bank = new Bank();
        Supplier<String> withdrawSupplier = bank::withdraw;
        System.out.println(withdrawSupplier.get()); // Output: WithDraw By User : 500

        // 3. Constructor reference (ClassName::new)
        Supplier<Bank> bankSupplier = Bank::new;
        Bank newBank = bankSupplier.get();
        System.out.println("New Bank object created: " + newBank);
    }
}
