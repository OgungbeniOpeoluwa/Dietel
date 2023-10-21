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
        String number = "100";
        assertEquals(4,DecimalToBinary.binaryToDecimal(number));
    }

}