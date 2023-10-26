package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenTwoPointTest {
    @Test
    public void testDistanceBetweenTwoPoint(){
        int number = 5;
        assertEquals(number,DistanceBetweenTwoPoint.distanceOfTwoFunction(4,0,3,0));
    }

}