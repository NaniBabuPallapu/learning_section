package company.com.important_interfaces_classes.singleton_class_example;

import java.util.Scanner;

public class SingletonClassExample {

    private static final CustomLogger customLogger = CustomLogger.getInstance();

    public static void divisionExample(int value) {
        try {
            if (value == 0) {
                customLogger.printLog("Denominator should not be zero");
                throw new ArithmeticException();
            }
            int data = 20 / value;
            System.out.println("Data : " + data);
        } catch (Exception ex) {
            customLogger.printLog("Exception Occurred : " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Enter Number ===");
        int value = scanner.nextInt();
        divisionExample(value);
    }
}
