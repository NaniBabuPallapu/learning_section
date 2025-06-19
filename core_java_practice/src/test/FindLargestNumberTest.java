package test;

import company.com.basic_programs.FindLargestNumber;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FindLargestNumberTest {

    @Test
    public void testFindVowelOrConsonant(){
        char ch = 'a';
        Assert.assertEquals(ch+" Vowel" , FindLargestNumber.findAVowelOrConsonant(ch));
    }

    @Test
    public void testFindLargestNumberVoidMethod(){

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        FindLargestNumber.findLargestNumber(150, 100, 160);

        Assert.assertEquals("Largest Number : " + 160+"\r\n", outputStream.toString());
    }

    @Test
    public void testFindLargestNumberPrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
//        FindLargestNumber findLargestNumber = new FindLargestNumber();
        Method method = FindLargestNumber.class.getDeclaredMethod("findLargestNumberPrivateMethod", int.class, int.class, int.class);
        method.setAccessible(true);

        method.invoke(null,150, 100, 160 );
        Assert.assertEquals("Largest Number : " + 160+"\r\n", outputStream.toString());

    }
    @Test
    public void testFindLargestNumberPrivateNonStaticMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ByteArrayOutputStream byteArrayOutputStream  = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        FindLargestNumber findLargestNumber = new FindLargestNumber();

        Method method = findLargestNumber.getClass().getDeclaredMethod("findLargestNumberPrivateNonStaticMethod", int.class, int.class, int.class);

        method.invoke(findLargestNumber, 150,100,160);
        Assert.assertEquals("Largest Number : " + 160+"\r\n", byteArrayOutputStream.toString());


    }
}
