package company.com.important_interfaces_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
    private String name;
    private int yearOfRelease;
    private double rating;

    public Movie() {

    }

    public Movie(String name, int yearOfRelease, double rating) {
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
        return "Movie{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rating=" + rating +
                '}';
    }

    // sorting with movie name
    @Override
    public int compareTo(Movie movie) {
        return this.name.compareTo(movie.name);
    }

    /*

    //sorting with yearOfRelease
    @Override
    public int compareTo(Movie movie){
        return Integer.compare(this.yearOfRelease, movie.yearOfRelease);
    }
    */

    /*

    // sorting with rating
    @Override
    public int compareTo(Movie movie){
        return Double.compare(this.rating, movie.rating);
    }
    */

}

public class ComparableInterfaceExample {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Bahubali", 2015, 9.3));
        list.add(new Movie("Saaho", 2019, 5.5));
        list.add(new Movie("Varsham", 2005, 7.3));
        list.add(new Movie("Saalar", 2023, 6.3));
        list.add(new Movie("Darling", 2010, 8.3));

        System.out.println(list);

        System.out.println("\n");

        // Sorting Started
        Collections.sort(list);
        list.forEach(System.out::println);


    }
}
