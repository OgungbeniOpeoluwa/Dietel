package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypothenuseTriangleTest {
@Test
    public void testTheLengthOfHypothenuseForTheTriangle(){
    double expected = 5;
    assertEquals(expected, HypothenuseTriangle.hypotenuseCalculations(3.0,4.0));
}
    @Test
    public void testTheLengthOfAnotherHypothenuseForTheTriangle(){
        double expected = 13;
        assertEquals(expected, HypothenuseTriangle.hypotenuseCalculations(5.0,12.0));
    }
    @Test
    public void testTheLengthOfAnotherHypothenuseForTheTriangles(){
        double expected = 17;
        assertEquals(expected, HypothenuseTriangle.hypotenuseCalculations(8.0,15.0));
    }
}