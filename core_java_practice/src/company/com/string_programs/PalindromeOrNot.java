package company.com.string_programs;

public class PalindromeOrNot {
    public static void palindromeOrNot(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not A Palindrome String");
        }
    }

    public static void main(String[] args) {
        palindromeOrNot("madam");
    }
}
