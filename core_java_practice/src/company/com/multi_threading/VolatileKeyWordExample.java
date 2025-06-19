package company.com.multi_threading;

class Counter {
    private volatile boolean runningState = true;

    public void run() {
        int counter = 0;
        while (runningState) {
            counter++;
            System.out.println("Increased Counter : " + counter);

            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Thread Stopped");
    }

    public void stop() {
        runningState = false;
        System.out.println("Stopped Signal Sent");
    }
}

public class VolatileKeyWordExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread  = new Thread(counter::run);
        thread.start();
        Thread.sleep(2000);
        counter.stop();
    }
}