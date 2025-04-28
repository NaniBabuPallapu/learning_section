package company.com.string_programs;

/**
 * Concept	Description
 * String str = "Java"	Stored in String Constant Pool (interned)
 * new String("Java")	Creates new object in Heap, even if the value exists in the pool
 * ==	Compares reference (memory location)
 * .equals()	Compares content (actual string value)
 * StringBuilder	Mutable, not thread-safe, stored in Heap
 * StringBuffer	Mutable, thread-safe, stored in Heap
 * .intern()	Moves the string to constant pool if not already there
 */
public class ExampleProgram {
    public static void main(String[] args) {

        // ======= String Literals (Stored in String Constant Pool) =======
        String str1 = "Java";
        String str2 = "Java";

        // ======= String using new keyword (Stored in Heap) =======
        String str3 = new String("Java");
        String str4 = new String("Java");

        // ======= Comparing references and values =======
        System.out.println("str1 == str2 : " + (str1 == str2));         // true - same object in string pool
        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));// true - content comparison
        System.out.println("str1 == str3 : " + (str1 == str3));         // false - different memory locations
        System.out.println("str3 == str4 : " + (str3 == str4));         // false - two different heap objects
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true - content comparison

        // ======= StringBuilder (mutable, non-synchronized) =======
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println("StringBuilder Output: " + sb1);            // Hello World

        // ======= StringBuffer (mutable, synchronized) =======
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.append(" Java");
        System.out.println("StringBuffer Output: " + sb2);             // Hello Java

        // ======= Reference example =======
        String str5 = "Java";    // points to same pool object as str1 and str2
        System.out.println("str1 == str5 : " + (str1 == str5));         // true

        // Interning a String
        String str6 = new String("Java").intern(); // moves to pool if not present
        System.out.println("str1 == str6 : " + (str1 == str6));         // true

        // Summary
        System.out.println("\nMemory Explanation:");
        System.out.println("str1, str2, str5, str6 -> String Constant Pool");
        System.out.println("str3, str4 -> Heap memory (new keyword)");
        System.out.println("StringBuilder and StringBuffer -> Heap memory, mutable");
    }

}
