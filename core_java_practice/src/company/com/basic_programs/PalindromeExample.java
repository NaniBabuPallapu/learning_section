package company.com.basic_programs;

import java.util.Scanner;

public class PalindromeExample {
    public static void palindromeOrNot(String str){
        char[] charArray = str.toCharArray();

        StringBuilder result  = new StringBuilder();
        for(int i = charArray.length -1 ; i>=0; i--){
            result.append(charArray[i]);
        }
        if(result.toString().equals(str)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }


    public static void checkPalindrome(String str){
        String result = "";
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            result = result+charArray[i];
        }
        if(result.equals(str)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        System.out.println("==== Enter String ====");
        String str =  new Scanner(System.in).nextLine();
        checkPalindrome(str);
        palindromeOrNot(str);
    }
}
