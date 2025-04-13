package company.com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Today: " + today);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);

        LocalDate birthDate = LocalDate.of(1999, 2, 9);
        Period age = Period.between(birthDate, today);
        System.out.println("I am " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");


    }
}
