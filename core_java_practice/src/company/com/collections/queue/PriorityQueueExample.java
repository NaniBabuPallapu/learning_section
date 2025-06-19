package company.com.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.PriorityQueue;

enum Priority {
    HIGH,
    MEDIUM,
    LOW,
}

class Order {
    String orderId;
    Priority priority;

    public Order(String orderId, Priority priority) {
        this.orderId = orderId;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Priority: " + priority;
    }
}


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

        // ORDER PROCESSOR

        // PriorityQueue with custom comparator for priority
        PriorityQueue<Order> orderQueue = new PriorityQueue<>(Comparator.comparing(o -> o.priority));

        // Add some orders
        orderQueue.add(new Order("O100", Priority.MEDIUM));
        orderQueue.add(new Order("O101", Priority.HIGH));
        orderQueue.add(new Order("O102", Priority.LOW));
        orderQueue.add(new Order("O103", Priority.HIGH));

        System.out.println("Processing orders by priority:");
        while (!orderQueue.isEmpty()) {
            System.out.println(orderQueue.element());
        }

    }
}
