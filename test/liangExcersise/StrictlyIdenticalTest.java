package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrictlyIdenticalTest {
    @Test
    public void testIfNumberIsStrictlyIdentical(){
        int [] array = {1,2,3,4,5};
        int [] arrays = {1,2,3,4,5};
        assertTrue(StrictlyIdentical.isStrictlyIdentical(array,arrays));
    }
    @Test
    public void testIfNumberIsNotStrictlyIdentical(){
        int [] array = {2,1,3,4,5,8};
        int [] arrays = {1,2,3,4,5,6};
        assertFalse(StrictlyIdentical.isStrictlyIdentical(array,arrays));
    }
    @Test
    public void testIfNumberIsNotTheSameLength(){
        int [] array = {1,2,3,4,5};
        int [] arrays = {1,2,3,4,5,6};
        assertFalse(StrictlyIdentical.isStrictlyIdentical(array,arrays));
    }

}