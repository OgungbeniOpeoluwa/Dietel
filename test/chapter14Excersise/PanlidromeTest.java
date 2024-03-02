package chapter14Excersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanlidromeTest {
    @Test
    public void testThatBoyIsNotAPanlidrome(){
        String input = "boy";
        assertFalse(Panlidrome.pandlindrome(input));
    }
    @Test
    public void testThatMadamIsAPanlidrome(){
        String input= "madam";
        assertTrue(Panlidrome.pandlindrome(input));
    }

}