package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class partitionalistTest {
    @Test
    public void testForPartionOfAList(){
        int [] numb = {5, 2, 9, 3, 6, 8};
        int [] expected = {2,3,5,9,6,8};
        assertArrayEquals(expected,partitionalist.pivot(numb));

    }
    @Test
    public void testForPartionList(){
        int [] numb = {10 ,1 ,5, 16, 61, 9, 11 ,1};
        int [] expected = { 1, 5 ,9, 1, 10 ,16 ,61, 11};
        assertArrayEquals(expected,partitionalist.pivot(numb));

    }

}