package company.com.string_programs;

public class VowelAndConsonantsInString {

    public static void findVowelsAndConsonantsInString(String value) {
        // Convert to lowercase to simplify comparison
        value = value.toLowerCase();

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("'" + ch + "' is a vowel");
            } else if (ch == ' ') {
                System.out.println("Space is a blank character");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("'" + ch + "' is a consonant");
            } else {
                System.out.println("'" + ch + "' is not an alphabet character");
            }
        }
    }

    public static void main(String[] args) {
        findVowelsAndConsonantsInString("Hello World 123");
    }
}
