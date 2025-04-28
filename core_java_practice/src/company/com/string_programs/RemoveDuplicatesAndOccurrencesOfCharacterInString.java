package company.com.string_programs;

public class RemoveDuplicatesAndOccurrencesOfCharacterInString {
    private static void removeDuplicatesAndCountOccurrences(String value) {
        StringBuilder builder = new StringBuilder(value);
        for (int i = 0; i < builder.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < builder.length(); j++) {
                if (builder.charAt(i) == builder.charAt(j)) {
                    builder.setCharAt(j, '1'); // you can use same for StringBuffer also
                    count++;
                }
            }
            if (builder.charAt(i) != '1') {
                System.out.println(builder.charAt(i) + " repeated " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
//        String value = "abcdeabbcceedd";
        String value = "programming";
        removeDuplicatesAndCountOccurrences(value);
    }


}
