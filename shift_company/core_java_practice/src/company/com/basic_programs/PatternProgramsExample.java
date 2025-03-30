package company.com.basic_programs;

public class PatternProgramsExample {
    public static void pyramid() {
        for (int i = 1; i <= 5; i++) {   // Controls rows
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");   // Print spaces for alignment
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");   // Print stars
            }
            System.out.println();  // Move to next line after each row
        }
    }

    public static void main(String[] args) {
        pyramid();
    }
}
