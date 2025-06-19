package company.com.multi_threading;

import java.util.concurrent.*;

/**
 * 		- **Callable**: Similar to `Runnable`, but it can return a result or throw an exception.
 * 		- **Future**: Represents the result of an asynchronous computation. It can be used to check the status or retrieve the result.
 */
class PrintNumber implements Callable<Integer> {

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        PrintNumber printNumber = new PrintNumber();

        // Create ExecutorService with single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit Callable task and get Future
        Future<Integer> future = executor.submit(printNumber);

        // Get result (blocks until done)
        Integer result = future.get();
        System.out.println("Sum of numbers: " + result);

        // Shutdown executor
        executor.shutdown();
    }
}
