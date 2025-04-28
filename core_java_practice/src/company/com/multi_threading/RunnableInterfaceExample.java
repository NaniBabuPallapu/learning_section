package company.com.multi_threading;
class PrintNumbers implements Runnable{
    @Override
    public void run(){
        for(int i=101;i<=105;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableInterfaceExample {
    public static void main(String[] args) {
        PrintNumbers print = new PrintNumbers();
        Thread thread = new Thread(print);
        thread.start();

    }
}
