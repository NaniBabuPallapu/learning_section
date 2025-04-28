package company.com.array_programs;

public class LargestElementInArray {
    public static void largestElement(int[] array) {
        int max = array[0];
        int min = array[0];
/*        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
*/
        for(int value : array){
            if(value > max){
                max = value;
            }
            if(value < min){
                min = value;
            }
        }
        System.out.println("Maximum Element In Array : " + max);
        System.out.println("Maximum Element In Array : " + min);

    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 3, 6, 1, 18, 30, 15, 14, 6};
        largestElement(array);
    }
}
