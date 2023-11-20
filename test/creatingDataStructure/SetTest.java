package creatingDataStructure;

import CreatingDataStructure.Set;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    @Test
    public void testThatSetIsEmpty(){
       Set set = new Set();
       assertTrue(set.isEmpty());
    }
    @Test
    public void testThatSetIsNotEmpty(){
        Set set = new Set();
        set.add(8);
        assertFalse(set.isEmpty());
    }
    @Test
    public void getSize(){
        Set set = new Set();
        set.add(8);
        set.add(9);
        set.add(20);
        assertEquals(3,set.size());
    }
    @Test
    public void getValue(){
        Set set = new Set();
        set.add(20);
        set.add(9);
        set.add(20);
        set.add(3);
        set.add(3);
        String expected = "[3,8,9,20]";
        System.out.println(set);
        assertEquals(3,set.size());
    }
    @Test
    public void testRemove(){
        Set set = new Set();
        set.add(20);
        set.add(9);
        set.add(8);
        set.add(3);
        set.remove(9);
        System.out.println(set);
        assertEquals(3,set.size());
    }
    @Test
    public void testIterator(){
        Set set = new Set();
        set.add(20);
        set.add(9);
        set.add(8);
        set.iterator();
    }






}