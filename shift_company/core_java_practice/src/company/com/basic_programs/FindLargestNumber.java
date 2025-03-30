package company.com.basic_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindLargestNumber {
    public static void findVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }
    }

    public static void checkVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

    public static String findAVowelOrConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                return ch + " Vowel";
            default:
                return ch + " Consonant";
        }
    }

    public static void findLargestNumber(int a, int b, int c) {
        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println("Largest Number : " + max);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ====== Enter Character ====== ");
        char ch = buffer.readLine().charAt(0);
        findVowelOrConsonant(ch);
        checkVowelOrConsonant(ch);
        findAVowelOrConsonant(ch);
        findLargestNumber(10, 15, 4);
    }
}
