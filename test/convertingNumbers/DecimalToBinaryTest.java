package convertingNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {
    @Test
    public void testDecimalNumberToBinary(){
        int number = 5;
        assertEquals("101",DecimalToBinary.decimalNumber(number));
    }
    @Test
    public void testChangingNumberFromBinaryToDecimal(){
        String number = "1111";
        assertEquals(15,DecimalToBinary.binaryToDecimal(number));
    }

}