package company.com.collections.iterable;

/**
 * Iterable Interface
 * ==================
 * The Iterable interface is the root interface for all the collection classes.
 * The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.
 * It contains only one abstract method. i.e.,
 * <p>
 * Iterator<T> iterator()
 * <p>
 * Iterator interface
 * ==================
 * Iterator interface provides the facility of iterating the elements in a forward direction only.
 * 1	public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
 * 2	public Object next()	    It returns the element and moves the cursor pointer to the next element.
 * 3	public void remove()        It removes the last elements returned by the iterator. It is less used.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableInterfaceExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nani");
        list.add(("Rajesh"));
        list.add("Mahesh");
        list.add("Suresh");

        //only forward direction
        Iterator<String> iterable = list.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }


        // Using ListIterator for both forward and backward direction
        ListIterator<String> listIterator = list.listIterator();

        //You need to move forward first to position the iterator in such a way that hasPrevious() will work:
        // Forward iteration
        System.out.println("\nForward iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward iteration
        System.out.println("\nBackward iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
