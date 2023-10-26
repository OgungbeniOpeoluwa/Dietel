package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    public void testNumberIsNotAprimeNumber(){
        int number = 25;
        assertFalse(PrimeNumber.isPrimeNumber(number));
    }
    @Test
    public void testNumberIsAprimeNumber(){
        int number = 17;
        assertTrue(PrimeNumber.isPrimeNumber(number));
    }

}