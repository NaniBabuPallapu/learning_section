package company.com.basic_programs;

public class PrimeNumberExample {
    public static void checkPrimeNumberOrNot(int number) {
        boolean check = true;
        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void printPrimeNumbersUpToN(int value) {
        for (int i = 2; i <= value; i++) {
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }

    }
        public static void optimizedPrintPrimeNumbersUpToN(int value) {
            if (value < 2) return;

            System.out.print("Prime numbers up to " + value + ": 2 ");

            for (int i = 3; i <= value; i += 2) { // Skip even numbers
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean isPrime(int num) {
            if (num < 2) return false;
            if (num == 2 || num == 3) return true;
            if (num % 2 == 0 || num % 3 == 0) return false; // Skip even numbers

            for (int i = 5; i * i <= num; i += 6) { // Check only odd numbers up to √num
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        checkPrimeNumberOrNot(11);
        printPrimeNumbersUpToN(100);
        optimizedPrintPrimeNumbersUpToN(100);
    }
}
