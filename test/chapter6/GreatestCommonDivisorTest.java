package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
    public void grestestCommonDivisor(){
        int result = 12;
        assertEquals(result,GreatestCommonDivisor.commonDivisor(24,60));
    }

}