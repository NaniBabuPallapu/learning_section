package company.com;

public class SumOfNumber {
    public static void sumOfNumbers(){
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void search(int[] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                System.out.println("Element Found At "+i+" position");
            }
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids integer overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        sumOfNumbers();
        search(new int[]{2,7,2,5,5,6,8,10}, 5);
        int result = binarySearch(new int[]{2,7,2,5,5,6,8,10}, 5);
        // Output result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
