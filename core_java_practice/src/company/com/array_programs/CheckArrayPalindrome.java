package company.com.array_programs;

import java.util.Arrays;

/**
 * Input: [1, 2, 3, 2, 1]
 * Output: true (Palindrome)
 *
 * Input: [1, 2, 3, 4, 5]
 * Output: false (Not a palindrome)
 */
public class CheckArrayPalindrome {
    public static void findPalindromeArray(int[] array){
        int[] result = new int[array.length];
        int count = 0;
        for(int i=array.length -1; i>=0;i--){
            result[count] = array[i];
            count++;
        }
        System.out.println(Arrays.toString(result));
        boolean check = Arrays.equals(array, result);
        if(check){
            System.out.println("Given Array Is a Palindrome");
        } else{
            System.out.println("It Is Not a Palindrome");
        }

    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,2,1};
        findPalindromeArray(array1);
    }
}
