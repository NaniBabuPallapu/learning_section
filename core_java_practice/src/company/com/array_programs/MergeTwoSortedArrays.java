package company.com.array_programs;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.util.Arrays;

/**
 * Merging Two Sorted Arrays in Java : Merging two sorted arrays means combining them into a single sorted array while maintaining the sorted order.
 * Input: array1 = [1, 3, 5], array2 = [2, 4, 6]
 * Output: [1, 2, 3, 4, 5, 6]
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] array1= {1,3,5};
        int[] array2= {2,4,6};

        int[] merged = new int[array1.length+array2.length];
        for(int i=0;i<array1.length;i++){
            merged[i] = array1[i];
        }
//        System.arraycopy(array1, 0, merged, 0, array1.length);
        int count = array1.length;
        for (int j : array2) {
            merged[count] = j;
            count++;
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }

}
