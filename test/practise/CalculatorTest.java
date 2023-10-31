package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testThatCalculatorCanAdd(){
        int result = 9;
        assertEquals(result,Calculator.addition(2+3+4));
    }
    @Test
    public void testThatCalculatorCanAddAnotherWithAdditionSign(){
        assertTrue(Calculator.checkIfNumberHasADigitAndCharacterSigns("1234"));
    }

}