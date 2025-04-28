package company.com.exception_handling_programs;

import java.io.*;
import java.sql.SQLException;

public class ExceptionHandlingExample {
    public static void throwExample(int denominator) {
        int value = 20;
        if (denominator == 0) {
            throw new ArithmeticException("Can Not Division By Zero");
        }
        value = value / denominator;
        System.out.println("Value = " + value);
    }

    public static void throwsExample() throws IOException, SQLException {
        File file = new File("c://student.tsx");
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (bufferedReader.readLine() != null) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
        throw new SQLException("Storing Failed"); // if any storing operation required
    }

    public static void tryCatchBlockAndFinally() {
        BufferedReader bufferedReader = null;
        try {
            File file = new File("C://Users//nanip//Downloads//random-text.txt");
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Operation Completed OR Terminated");
        }
    }

    public static void tryWithResource() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C://Users//nanip//Downloads//random-text.txt")))) {
            while (bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
            boolean check = new File("C://Users//nanip//Downloads//random-text.txt").delete();
            if (check) {
                System.out.println("File Deleted Successfully");
            } else {
                System.out.println("Unable To Delete File");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Throw Keyword Example ===");
        try {
            throwExample(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");

        System.out.println("=== Throws Keyword Example ===");
        try {
            throwsExample();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("\n");

        System.out.println("=== Try Catch Block Example ===");
        tryCatchBlockAndFinally();

        System.out.println("\n");

        System.out.println("=== Try With Resources Block Example ===");
        tryWithResource();

        System.out.println("\n");


    }
}
