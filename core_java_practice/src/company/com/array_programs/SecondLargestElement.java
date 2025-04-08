package company.com.array_programs;

import java.util.Arrays;

public class SecondLargestElement {
    // Using Bubble Sorting Algorithms
    public static void secondLargestElement(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            sortedArray[i] = array[i];
        }
        System.out.print("Sorted Array : " + Arrays.toString(sortedArray));
        System.out.println("\n");
        System.out.println("Second Largest Element : " + sortedArray[sortedArray.length - 2]);
    }


    public static void main(String[] args) {
        int[] array = {2, 6, 7, 1, 5, 6, 7, 2, 8};
        secondLargestElement(array);


    }
}
