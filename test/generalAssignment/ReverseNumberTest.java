package generalAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    @Test
    public void testNumberReverse(){
        int result = ReverseNumber.reverseNumber(344455);
        assertEquals(554443,result);
    }

}