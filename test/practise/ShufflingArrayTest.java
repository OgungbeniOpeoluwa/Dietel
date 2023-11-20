package practise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShufflingArrayTest {
    @Test
    public void testThatArrayISshuffled(){
        int [] arrays = {42,18,41,22,15,12};
        int [] expected = {18,42,22,41,12,15};
        assertArrayEquals(expected,ShufflingArray.shuffleFunction(arrays));
    }
    @Test
    public void testAnotherThatArrayISshuffled(){
        int [] arrays = {42,18,41,15,22};
        int [] expected = {18,42,15,41,22};
        assertArrayEquals(expected,ShufflingArray.shuffleFunction(arrays));
    }
    @Test
    public void testAnotherThatArrayshuffled(){
        int [] arrays = {42,15,18,12,13,3};
        int [] expected = {42,15,12,18,13,3};;
        assertArrayEquals(expected,ShufflingArray.fillShuffleFunction(arrays));
    }
    @Test
    public void testAnotherOneThatArrayshuffled(){
        int [] arrays = {42,15,18,12,13};
        int [] expected = {42,15,12,18,13};
        assertArrayEquals(expected,ShufflingArray.fillShuffleFunction(arrays));
    }


}