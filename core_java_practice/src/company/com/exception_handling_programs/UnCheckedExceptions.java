package company.com.exception_handling_programs;

public class UnCheckedExceptions {

    public static void nullPointerExceptionExample(String value) {
        try {
            System.out.println("Processing value: " + value);
            System.out.println("Length: " + value.length()); // This may throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot get length of a null string.");
            e.printStackTrace();
        }
    }

    public static void arithmeticExceptionExample(int division) {
        try {
            int value = 10;
            System.out.println("10 / " + division + " = " + (value / division)); // May throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
            e.printStackTrace();
        }
    }

    public static void indexOutOfBoundException(int[] array) {
        try {
            System.out.println("Accessing index 3: " + array[3]); // May throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index 3 is out of bounds.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String value = null;
        int division = 0;
        int[] array = {1, 2, 3}; // Only 3 elements, index 3 is invalid

        System.out.println("\n--- Demonstrating NullPointerException ---");
        nullPointerExceptionExample(value);

        System.out.println("\n--- Demonstrating ArithmeticException ---");
        arithmeticExceptionExample(division);

        System.out.println("\n--- Demonstrating ArrayIndexOutOfBoundsException ---");
        indexOutOfBoundException(array);
    }
}
