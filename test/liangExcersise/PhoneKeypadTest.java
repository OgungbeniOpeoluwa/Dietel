package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneKeypadTest {
    @Test
    public void testThat_givenStringWithANumberCanBeTranslatedToNumbers(){
        String number = "1-800-Flowers";
        String expected = "1-800-3569377";
        assertEquals(expected,PhoneKeypad.stringToNumberFunction(number));
    }
    @Test
    public void testAnotherAlphabetNumber(){
        String number = "1-69t-thers3-890";
        String expected = "1-698-843773-890";
        assertEquals(expected,PhoneKeypad.stringToNumberFunction(number));

    }
    @Test
    public void testAnotherAlphabetNumber2(){
        String number = "1-69t-thers3-890rree";
        String expected = "1-698-843773-8907733";
        assertEquals(expected,PhoneKeypad.stringToNumberFunction(number));

    }

}