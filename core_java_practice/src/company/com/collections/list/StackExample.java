package company.com.collections.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> books = new Stack<>();

        // Push elements onto the stack
        books.push("Java");
        books.push("Python");
        books.push("C++");
        books.push("JavaScript");

        // Display the stack
        System.out.println("Books Stack: " + books);

        // Peek the top element
        System.out.println("Top Book: " + books.peek());

        // Pop the top element
        System.out.println("Popped: " + books.pop());

        // Display stack after pop
        System.out.println("After Pop: " + books);

        // Search for an element
        int position = books.search("Java");
        if (position != -1) {
            System.out.println("Java found at position (from top): " + position);
        } else {
            System.out.println("Java not found");
        }

        // Check if stack is empty
        System.out.println("Is stack empty? " + books.isEmpty());
    }
}
