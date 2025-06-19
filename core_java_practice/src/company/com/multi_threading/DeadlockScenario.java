package company.com.multi_threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockScenario {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void methodA() {
        lock1.lock();
        System.out.println(Thread.currentThread().getName() + " acquired lock1 in methodA");

        try {
            // Adding delay to make deadlock more likely
            Thread.sleep(100);
            lock2.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock2 in methodA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock2.unlock();
            lock1.unlock();
        }
    }

    public void methodB() {
        lock2.lock();
        System.out.println(Thread.currentThread().getName() + " acquired lock2 in methodB");

        try {
            // Adding delay to make deadlock more likely
            Thread.sleep(100);
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock1 in methodB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock1.unlock();
            lock2.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== SCENARIO WHERE DEAD LOCK HAPPENED.... BELOW ```Successfully Completed```  WILL NEVER BE PRINTED..BCZ OF THIS DEAD LOCK ===");
        DeadlockScenario example = new DeadlockScenario();

        Thread t1 = new Thread(() -> example.methodA(), "Thread-1");
        Thread t2 = new Thread(() -> example.methodB(), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Successfully Completed");
    }
}
