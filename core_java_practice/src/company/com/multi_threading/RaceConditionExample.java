package company.com.multi_threading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Race Condition : You're running two threads (t1 and t2), and each one is incrementing the same counter variable 1000 times, so you’d expect the final value to be 2000.
 * If two threads read counter at the same time, they both increment the same value and write it back — overwriting each other's work.
 * Both threads read counter = 100.
 *
 * Both compute counter + 1 = 101.
 *
 * Both write 101 — so you've lost one increment!
 */
public class RaceConditionExample{
    private int counter = 0;
//    private AtomicInteger count = new AtomicInteger(0); // to prevent race condition alternative for synchronized and locks

    public  void increment() {
        counter++;
//        count.incrementAndGet();
    }

    // making above method synchronized to resolve race condition, so our result will be 2000.
    /*
    public synchronized void increment() {
        counter++;
    }
    */
    public int getCounter() {
        return counter;
//        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionExample example = new RaceConditionExample();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter: " + example.getCounter());
    }
}
