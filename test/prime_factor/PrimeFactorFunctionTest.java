 package prime_factor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorFunctionTest {
    @Test
    public void testListOfPrimeNumberInAFunction(){
        int number = 24;
        String result = "2223";
        assertEquals(result, PrimeFactorFunction.primeNumber(number));
    }
    @Test
    public void testListOf25PrimeNumberInAFunction(){
        int number = 25;
        String result = "55";
        assertEquals(result, PrimeFactorFunction.primeNumber(number));
    }
    @Test
    public void testNumberSaveInAnArray(){
        int number = 25;
        int []  expected ={5,5};
        assertArrayEquals(expected, PrimeFactorFunction.primeNumberFunction(number));
    }
    @Test
    public void testNumberInAnArray(){
        int number = 21;
        int []  expected ={3,7};
        assertArrayEquals(expected, PrimeFactorFunction.primeNumberFunction(number));
    }



}