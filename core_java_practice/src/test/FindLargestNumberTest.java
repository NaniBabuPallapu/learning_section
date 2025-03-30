package test;

import company.com.basic_programs.FindLargestNumber;
import org.junit.Assert;
import org.junit.Test;

public class FindLargestNumberTest {

    @Test
    public void testFindVowelOrConsonant(){
        char ch = 'a';
        Assert.assertEquals(ch+" Vowel" , FindLargestNumber.findAVowelOrConsonant(ch));
    }
}
