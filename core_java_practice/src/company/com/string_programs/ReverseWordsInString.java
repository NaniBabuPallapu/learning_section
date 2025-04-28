package company.com.string_programs;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void reverseWordsInString(String value) {
        String[] words = value.split(" ");
//        Arrays.stream(words).forEach(System.out::println);

        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]).append(" ");
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        String value = "I love Java programming";
        reverseWordsInString(value);
    }
}
