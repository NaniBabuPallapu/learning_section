package company.com.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private long hallTicketNumber;
    private boolean active;
    private char gender;
    private float percentage;

    public Student() {

    }

    public Student(int id, String name, long hallTicketNumber, boolean active, char gender, float percentage) {
        this.id = id;
        this.name = name;
        this.hallTicketNumber = hallTicketNumber;
        this.active = active;
        this.gender = gender;
        this.percentage = percentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHallTicketNumber(long hallTicketNumber) {
        this.hallTicketNumber = hallTicketNumber;
    }

    public long getHallTicketNumber() {
        return hallTicketNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hallTicketNumber=" + hallTicketNumber +
                ", active=" + active +
                ", gender=" + gender +
                ", marks=" + percentage +
                '}';
    }
}

public class ScannerClassExample {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Student ID (integer): ");
//        int id = scanner.nextInt();
        int id = Integer.parseInt(buffer.readLine());
        scanner.nextLine(); // Consume the leftover newline
        System.out.println("Enter Student Name (string): ");
//        String name = scanner.nextLine();
        String name = buffer.readLine();
        System.out.println("Enter Phone Number (long): ");
//        long phoneNumber = scanner.nextLong();
        long phoneNumber = Long.parseLong(buffer.readLine());

        System.out.println("Is Active? (true/false): ");
//        boolean isActive = scanner.nextBoolean();
        boolean isActive = Boolean.parseBoolean(buffer.readLine());
        System.out.println("Enter Gender (M/F): ");
//        char gender = scanner.next().charAt(0);
        char gender = buffer.readLine().charAt(0);
        System.out.println("Enter Percentage (float): ");
//        float percentage = scanner.nextFloat();
        float percentage = Float.parseFloat(buffer.readLine());

        Student student = new Student(id, name, phoneNumber, isActive, gender, percentage);
        System.out.println(student);
        scanner.close();
    }
}
