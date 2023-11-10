package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSequenceTest {
    @Test
    public void testSumOfFibonacciSeries(){
        int number = 15;
        int result = 377;
        assertEquals(result,FibonacciSequence.fibonanciSequenceFunction(number));
    }

    @Test
    public void testSumOfAnotherFibonacciSeries(){
        int number = 3;
        int result = 1;
        assertEquals(result,FibonacciSequence.fibonanciSequenceFunction(number));
    }

}
