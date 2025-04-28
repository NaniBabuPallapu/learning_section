package company.com.string_programs;

public class ReverseString {

    public static void reverseString(String value) {
        String result = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            result = result + value.charAt(i);
        }
        System.out.println("Reversed String : " + result);
    }

    public static void reverseStringUsingStringBuffer(String value) {
        StringBuffer result = new StringBuffer();
        for (int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        System.out.println("Reversed String : " + result);
    }

    public static void reverseStringUsingStringBuilder(String value) {
        StringBuilder result = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        System.out.println("Reversed String : " + result);
    }

    public static void main(String[] args) {
        reverseString("Hello World");

        reverseStringUsingStringBuffer("Hello World");

        reverseStringUsingStringBuilder("Hello World");

    }
}
