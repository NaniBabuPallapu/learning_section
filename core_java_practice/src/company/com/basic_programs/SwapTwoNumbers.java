package company.com.basic_programs;

public class SwapTwoNumbers {
    public void swapWithOutTemp(int a, int b) {
        System.out.println("BEFORE SWAPPING : a = " + a + " , b = " + b);
        a = a + b; // a = 10 + 20 = 30;
        b = a - b; // b = 30 - 20 = 10;
        a = a - b; // a = 30 - 10 = 20;
        System.out.println("AFTER SWAPPING : a = " + a + " , b = " + b);
    }

    public void swapWithTemp(int a, int b) {
        System.out.println("BEFORE SWAPPING : a = " + a + " , b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("AFTER SWAPPING : a = " + a + " , b = " + b);
    }

    public static void main(String[] args) {
        SwapTwoNumbers swap = new SwapTwoNumbers();
        swap.swapWithOutTemp(10, 20);
        swap.swapWithTemp(50, 100);
    }
}
