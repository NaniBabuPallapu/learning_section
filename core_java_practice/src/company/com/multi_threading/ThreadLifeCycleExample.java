package company.com.multi_threading;

public class ThreadLifeCycleExample {
    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            System.out.println("=== Thread is executing ===");

            try{
                Thread.sleep(2000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            System.out.println("=== Thread completed its execution ===");
        });

        thread.start();

        try{
            thread.join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("=== Terminated ===");
    }
}