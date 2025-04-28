package company.com.multi_threading;

class Printer extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadClassExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();
    }
}
