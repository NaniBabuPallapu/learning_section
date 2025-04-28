package company.com.string_programs;


/**
 * Input: "swiss"
 * <p>
 * Output: First non-repeating character: w
 */
public class FirstNonRepeatingCharacterInString {
    public static void findFirstNonRepeatingChar(String value) {
        char[] array = value.toCharArray();

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = '1';
                    count++;
                }
            }
            if (count == 1 && array[i] != '1') {
                System.out.println("First Non Repeating Character : " + array[i]);
                return;
            }

        }
        System.out.println("No non-repeating character found.");
    }

    public static void main(String[] args) {
        findFirstNonRepeatingChar("swiss");
    }
}
