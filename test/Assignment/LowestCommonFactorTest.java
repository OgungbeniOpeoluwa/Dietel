package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonFactorTest {
    @Test
    public void testArrayOfLowestCommonFactor(){
        int [] array = {2,3};
        assertArrayEquals(array,LowestCommonFactor.result(12,36));
    }



}