package company.com.string_programs;

/**
 * This program demonstrates useful String methods:
 * <p>
 * Basic:
 * - trim(): Remove leading/trailing spaces - before the first visible character and after the last visible character -It does NOT remove spaces in between words. usage :  User input	When users accidentally add spaces while typing
 * - toUpperCase(), toLowerCase(): Case conversion
 * - substring(): Extract substring
 * - charAt(): Get char at index
 * - indexOf(): Find substring position
 * - equals(), equalsIgnoreCase(): String comparison
 * - split(): Split string into array
 * - length(): Get total length
 * <p>
 * Advanced:
 * - replace(): Replace characters or substrings
 * - startsWith(), endsWith(): Check string beginning/end
 * - contains(): Check for substring presence
 * - join(): Combine strings with delimiter
 * - compareTo(): Lexicographically compare strings
 * - isEmpty(), isBlank(): Check for empty/blank (Java 11+)
 * - repeat(): Repeat a string (Java 11+)
 */
public class StringMethodsDemo {

    public static void main(String[] args) {
        String original = "  Hello Java World  ";

        // 1. trim(): Removes leading and trailing spaces
        String trimmed = original.trim();
        System.out.println("1. Trimmed String: [" + trimmed + "]");

        // 2. toUpperCase() and toLowerCase()
        System.out.println("2. Uppercase: " + trimmed.toUpperCase());
        System.out.println("3. Lowercase: " + trimmed.toLowerCase());

        // 3. substring(): Extract part of string
        String sub = trimmed.substring(6, 10); // from index 6 to 9
        System.out.println("4. Substring (6,10): " + sub);  // Output: Java

        // 4. charAt(): Get character at specific position
        char ch = trimmed.charAt(1); // e
        System.out.println("5. Character at index 1: " + ch);

        // 5. indexOf(): Find position of a character or string
        int index = trimmed.indexOf("Java");
        System.out.println("6. Index of 'Java': " + index);

        // 6. equals() vs equalsIgnoreCase()
        String test = "hello java world";
        System.out.println("7. equals(): " + trimmed.equals(test)); // false
        System.out.println("8. equalsIgnoreCase(): " + trimmed.equalsIgnoreCase(test)); // true

        // 7. split(): Split string by space
        String[] words = trimmed.split(" ");
        System.out.println("9. Words from split:");
        for (String word : words) {
            System.out.println(" - " + word);
        }

        // 8. length(): Total characters
        System.out.println("10. Length of original string (with spaces): " + original.length());
        System.out.println("11. Length of trimmed string: " + trimmed.length());

        // ----- Advanced String Methods -----
        String line = "Java is powerful";

        // 9. replace(): Replace characters
        String replaced = line.replace("a", "@");
        System.out.println("12. Replaced 'a' with '@': " + replaced);  // J@v@ is powerful

        // 10. startsWith() and endsWith()
        System.out.println("13. Starts with 'Java'? " + line.startsWith("Java"));     // true
        System.out.println("14. Ends with 'powerful'? " + line.endsWith("powerful")); // true

        // 11. contains(): Check for substring
        System.out.println("15. Contains 'is'? " + line.contains("is")); // true

        // 12. join(): Combine strings with delimiter
        String joined = String.join(" - ", "Spring", "Hibernate", "JPA");
        System.out.println("16. Joined tech stack: " + joined); // Spring - Hibernate - JPA

        // 13. compareTo(): Lexicographical comparison
        String s1 = "apple";
        String s2 = "banana";
        int result = s1.compareTo(s2); // negative if s1 < s2
        System.out.println("17. Comparing 'apple' to 'banana': " + result);

        // 14. isEmpty() and isBlank() (Java 11+)
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("18. isEmpty(): " + emptyStr.isEmpty()); // true
        System.out.println("19. isBlank(): " + blankStr.isBlank()); // true (Java 11+)

        // 15. repeat() (Java 11+)
        String repeat = "Hi! ".repeat(3);
        System.out.println("20. Repeated string: " + repeat); // Hi! Hi! Hi!
    }
}
