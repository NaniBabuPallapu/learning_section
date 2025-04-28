package company.com.string_programs;

public class FindOnlyStringContainsOnlyDigits {

    public static void containsOnlyDigits(String str) {
        boolean check = true;

        //ch < '0' → means the character is before '0' (not a digit).
        //ch > '9' → means the character is after '9' (also not a digit).
        if (str != null && !str.isEmpty()) {

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch < '0' || ch > '9') { // If the character is not between '0' and '9', it's not a digit.
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(str + " Contains only digits");
            } else {
                System.out.println("Character found in : " + str);
            }
        } else {
            System.out.println("String is null.");
        }
    }

    public static void findStringContainsOnlyDigits(String value) {
        boolean check = true;

        char[] array = value.toCharArray();
        for (char ch : array) {
            if (!Character.isDigit(ch)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(value + " Contains only digits");
        } else {
            System.out.println("Character found in : " + value);
        }
    }

    public static void main(String[] args) {
        String test1 = "123456";
        String test2 = "123abc";
        findStringContainsOnlyDigits(test2);
        containsOnlyDigits(test2);
    }
}
