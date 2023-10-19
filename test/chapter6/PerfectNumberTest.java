package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {
    @Test
    public void testIfANumberIsAPerfectNumber(){
        int numbers = 6;
        boolean result = PerfectNumber.isPerfect(numbers);
        assertTrue(result);
    }
    @Test
    public void testIfNumberIsNumberIsNotAPerfectNumber(){
        int number = 8;
        boolean result = PerfectNumber.isPerfect(number);
        assertFalse(result);
    }
    @Test
    public void testIfAnumberIsAPrimeNumber(){
        int number = 9;
        boolean result = PrimeNumber.isPrimeNumber(number);
        assertTrue(result);
    }
    @Test
    public void testThatANumberIsNotAPerfectNumber(){
        int number = 6;
        boolean result = PrimeNumber.isPrimeNumber(number);
        assertFalse(result);
    }





}