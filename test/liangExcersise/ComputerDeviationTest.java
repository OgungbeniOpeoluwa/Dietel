package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerDeviationTest {
    @Test
    public void testCollectedNumberIsSaveInAnArrayOfTen(){
        double [] number = {1.9 ,2.5 ,3.7 ,2 ,1 ,6 ,3 ,4, 5, 2};
        assertArrayEquals(number,ComputerDeviation.getInput(1.9, 2.5 ,3.7 ,2 ,1 ,6 ,3 ,4 ,5 ,2));
    }
    @Test
    public void testSumOfArray(){
        double [] number = {1.9 ,2.5 ,3.7 ,2 ,1 ,6 ,3 ,4, 5, 2};
        double result = 31.1;
        assertEquals(result,ComputerDeviation.getTotal(number));
    }

    @Test
    public void testForTestMean(){
        double [] number = {1.9 ,2.5 ,3.7 ,2 ,1 ,6 ,3 ,4, 5, 2};
        double result = 3.11;
        assertEquals(result,ComputerDeviation.mean(number));
    }
    @Test
    public void testForTestStandardDeviation(){
        double [] number = {1.9 ,2.5 ,3.7 ,2 ,1 ,6 ,3 ,4, 5, 2};;
        double result = 1.55738;
        assertEquals(result,ComputerDeviation.standardDeviation(number));
    }




}