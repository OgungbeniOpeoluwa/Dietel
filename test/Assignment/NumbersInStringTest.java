package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersInStringTest {
    @Test
    public void testStringReturnsNumberInside(){
        String [] words = {"-0AB-C21F-1110","13CPZ","A1L"};
        int numb = NumbersInString.number(words);
        assertEquals(10,numb);
    }
    @Test
    public void testStringDoesNotHaveNumberInside(){
        String [] words = {"ABCF","CPZ","AL"};
        int numb = NumbersInString.number(words);
        assertEquals(0,numb);
    }

}