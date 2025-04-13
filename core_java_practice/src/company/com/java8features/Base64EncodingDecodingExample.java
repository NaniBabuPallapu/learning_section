package company.com.java8features;

import java.util.Base64;

public class Base64EncodingDecodingExample {
    public static void main(String[] args) {
        System.out.println("\n");
        String original = "secret123";

        // Encoding
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded);

        // Decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded);
        System.out.println("\n");

    }
}
