package convertingNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {
    @Test
    public void testDecimalNumberToBinary(){
        int number = 34;
        assertEquals("100010",DecimalToBinary.decimalNumber(number));
    }
    @Test
    public void testChangingNumberFromBinaryToDecimal(){
        String number = "10000";
        assertEquals(16,DecimalToBinary.binaryToDecimal(number));
    }

}