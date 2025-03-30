package company.com.basic_programs;

public class FibonacciSeriesExample {
    public static void method1() {
        int first = 0;
        int second = 1;
        int result;
        System.out.print(first + " " + second);

        int n = 100;
        do {
            result = first + second;
            if (result > n) {
                break; // Prevent printing numbers beyond 'n'
            }
            first = second;
            second = result;
            System.out.print(" " + result);
        } while (result < n);

        System.out.println();
    }

    public static void method2() {
        int first = 0;
        int second = 1;
        int result;
        System.out.print(first + " " + second);
        int n = 1000;
        while (true) {
            result = first + second;
            if (result > n) {
                break; // Ensures we don't print numbers exceeding 'n'\
            }
            first = second;
            second = result;
            System.out.print(" " + result);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
