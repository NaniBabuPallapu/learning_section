package company.com.string_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubStringsFromString {

    // Method to generate all substrings of the input string
    public static List<String> getSubStrings(String string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {  // j should go up to the length of the string
                String subString = string.substring(i, j);
                list.add(subString);
            }
        }
        return list;
    }

    // Method to find the longest substring without repeating characters
    public static void findLongestSubstringWithoutRepeatingCharacters(String str) {
        int maxLength = 0;
        String longestSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder currentSubstring = new StringBuilder();

            for (int j = i; j < str.length(); j++) {
                char currentChar = str.charAt(j);

                if (!set.contains(currentChar)) {
                    set.add(currentChar);
                    currentSubstring.append(currentChar);

                    // Update the longest substring if the current one is longer
                    if (currentSubstring.length() > maxLength) {
                        maxLength = currentSubstring.length();
                        longestSubstring = currentSubstring.toString();
                    }
                } else {
                    break;  // Break the loop if there's a repeat character
                }
            }
        }

        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static void main(String[] args) {
        List<String> list;

//        String str = "pwwkew";  // Test string 1
//         list = getSubStrings(str);
//        System.out.println("All Substrings: " + list);
//
//        // Find the longest substring without repeating characters
//        findLongestSubstringWithoutRepeatingCharacters(str);

        String str2 = "abcabcbb";  // Test string 2
        list = getSubStrings(str2);
        System.out.println("All Substrings: " + list);

        // Find the longest substring without repeating characters
        findLongestSubstringWithoutRepeatingCharacters(str2);
    }
}
