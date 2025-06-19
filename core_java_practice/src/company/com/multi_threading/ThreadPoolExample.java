package company.com.multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * imagine sending xml bods for communication to another service to validate the order and everytime we create xml bod and process them in order management
 */
public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Submit tasks to the pool
        for (int i = 1; i <= 5; i++) {
            int value = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing task"+" value : "+ value);
            });
        }

        pool.shutdown();

    }
}
