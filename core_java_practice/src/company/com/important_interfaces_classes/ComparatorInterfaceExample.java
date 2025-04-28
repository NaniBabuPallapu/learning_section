package company.com.important_interfaces_classes;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cinema {
    private String name;
    private int yearOfRelease;
    private double rating;

    public Cinema() {

    }

    public Cinema(String name, int yearOfRelease, double rating) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rating=" + rating +
                '}';
    }
}

class NameSorting implements Comparator<Cinema> {

    @Override
    public int compare(Cinema cinema1, Cinema cinema2) {
        return cinema1.getName().compareTo(cinema2.getName());
    }
}

class YearOfReleaseSorting implements Comparator<Cinema> {
    @Override
    public int compare(Cinema cinema1, Cinema cinema2) {
        return Integer.compare(cinema1.getYearOfRelease(), cinema2.getYearOfRelease());
    }

}

class RatingSorting implements Comparator<Cinema> {

    public int compare(Cinema cinema1, Cinema cinema2) {
        return Double.compare(cinema1.getRating(), cinema2.getRating());
    }
}

public class ComparatorInterfaceExample {
    public static void main(String[] args) {
        List<Cinema> list = new ArrayList<>();
        list.add(new Cinema("Bahubali", 2015, 9.3));
        list.add(new Cinema("Saaho", 2019, 5.5));
        list.add(new Cinema("Varsham", 2005, 7.3));
        list.add(new Cinema("Saalar", 2023, 6.3));
        list.add(new Cinema("Darling", 2010, 8.3));

        System.out.println(list);

        System.out.println("\n");

        //Sorting Started

/*
        // Name Sorting
        NameSorting nameSorting = new NameSorting();
        Collections.sort(list, nameSorting);
        System.out.println("Sorted Using Name : ");
        list.forEach(System.out::println);

        // Year Of Release Sorting
        YearOfReleaseSorting release = new YearOfReleaseSorting();
        Collections.sort(list, release);
        System.out.println("Sorted Using Year Of Release : ");
        list.forEach(System.out::println);
*/

        //Rating Sorting
        RatingSorting rating = new RatingSorting();
        Collections.sort(list, rating);
        System.out.println("Sorted Using Rating : ");
        list.forEach(System.out::println);


    }
}
