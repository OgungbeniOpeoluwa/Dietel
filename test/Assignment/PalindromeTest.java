package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testAnagram(){
        boolean value = Palindrome.anagramFunction("--1101+++","--111+++0");
        assertTrue(value);
    }
    @Test
    public void testNotAAnagram(){
        boolean value = Palindrome.anagramFunction("dAn","D");
        assertFalse(value);
    }
    @Test
    public void testNotAnagram(){
        boolean value = Palindrome.anagramFunction("DAD","ADAAg");
        assertFalse(value);
    }
    @Test
    public void testPalindrome(){
        boolean value = Palindrome.palindrome("0110");
        assertTrue(value);
    }
    @Test
    public void testStringIsNotAPalindromee(){
        boolean value = Palindrome.palindrome("name");
        assertFalse(value);
    }

}