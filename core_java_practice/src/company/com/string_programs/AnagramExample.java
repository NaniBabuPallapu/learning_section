package company.com.string_programs;

import java.util.Arrays;

/**
 * "listen" and "silent" → ✅ Anagram (Same characters and Same Size)
 * <p>
 * "triangle" and "integral" → ✅ Anagram (Same characters and Same Size)
 * <p>
 * "apple" and "pale" → ❌ Not an anagram (different characters or count)
 */
public class AnagramExample {

    public static void anagram(String value1, String value2) {
        if (value1.length() != value2.length()) {
            System.out.println("Strings are not anagram. Different Size Found");
            return;
        }
        value1 = value1.toLowerCase();
        value2 = value2.toLowerCase();

        char[] charArray1 = value1.toCharArray();
        char[] charArray2 = value2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("String Are Anagram");
        } else {
            System.out.println("String Are Not Anagram");
        }
    }

    public static void main(String[] args) {
        String value1 = "Listen";
        String value2 = "Silent";
        anagram(value1, value2);
    }
}
