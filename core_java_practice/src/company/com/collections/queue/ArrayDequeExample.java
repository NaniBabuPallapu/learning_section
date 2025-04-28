package company.com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // Creating an ArrayDeque of Integer type
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front (addFirst)
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        // Adding elements to the back (addLast)
        deque.addLast(40);
        deque.addLast(50);

        // Display the current deque
        System.out.println("Deque after adding elements: " + deque);

        // Removing elements from the front (removeFirst)
        int removedFront = deque.removeFirst();
        System.out.println("Removed from front: " + removedFront);

        // Removing elements from the back (removeLast)
        int removedBack = deque.removeLast();
        System.out.println("Removed from back: " + removedBack);

        // Retrieving elements without removal (peekFirst and peekLast)
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());

        // Display the final deque
        System.out.println("Final deque: " + deque);
    }
}
