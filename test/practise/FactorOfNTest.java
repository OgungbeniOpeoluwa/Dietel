package practise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FactorOfNTest {
    @Test
    public void testKFactorOfN(){
        int result = 3;
        assertEquals(result,FactorOfN.functionOfFactor(12,3));
    }
    @Test
    public void testThatNumberPutInReturnItValueInAList(){
        int number = 5;
        int [] array = {1,2,5,6,7};
        assertEquals(number,FactorOfN.returnValueInAlist(array,3));

    }
    @Test
    public void testAnotherNumber(){
        int number = 7;
        assertEquals(number,FactorOfN.functionOfFactor(7,2));
    }
    @Test
    public  void testWhenValueIsLessThanWhatInTheList(){
        int number = -1;
        assertEquals(number,FactorOfN.functionOfFactor(4,4));
    }

}