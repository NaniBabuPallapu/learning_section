package company.com.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
//        numbers.add(null); // cause an exception bcz not allowed
        numbers.offer(60);
        System.out.println("Head (peek): " + numbers.peek());   // 10
        System.out.println("Head removed from queue: " + numbers.poll()); // 10
        numbers.remove(15);     // remove specific element
        System.out.println(numbers);

    }
}
