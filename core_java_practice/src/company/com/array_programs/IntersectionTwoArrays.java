package company.com.array_programs;

import java.util.Arrays;

/**
 * Intersection of Two Arrays in Java : The intersection of two arrays means finding the common elements that appear in both arrays without duplicates.
 * For example:
 * Input: array1 = [1, 2, 2, 1], array2 = [2, 2]
 * Output: [2]
 */
public class IntersectionTwoArrays {
    public static void findIntersection(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    array1[j] = -1;
                }
            }
            if (array1[i] != -1) {
                for (int value : array2) {
                    if (array1[i] == value) {
                        result[i] = array1[i];
                        break;
                    }
                }
            }
        }

        System.out.println("Result : " + Arrays.toString(result));
        // remove the zeros from array
        for (int value : result) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 7, 2, 6, 2, 7,};
        int[] array2 = {2, 5, 8, 9, 3};
        findIntersection(array1, array2);

    }
}
