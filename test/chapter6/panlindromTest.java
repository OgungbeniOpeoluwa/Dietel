package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class panlindromTest {
    @Test
    public void testNumberIsAPanlidrome(){
        String number = "11211";
        assertTrue(panlindrom.isPanlidrome(number));

    }
    @Test
    public void testNumberIsNotAPanlidrome(){
        String number = "112112";
        assertFalse(panlindrom.isPanlidrome(number));

    }

}