package Assignment;

import chibuzorAssignment.FunctionArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsArrayTest {
    @Test
    public void returnDuplicateNumber(){
        int [] numb = {1,2,3,3,2,4,5,6,6,6,6};
        int [] answer = {2,3,6};
        assertArrayEquals(answer, FunctionsArray.returnDuplicateNumber(numb));
    }
    @Test
    public void returnAnotherDuplicateNumber(){
        int [] numb = {1,2,3,3,2,4,5,6,5,6,8};
        int [] answer = {2,3,5,6};
        assertArrayEquals(answer, FunctionsArray.returnDuplicateNumber(numb));
    }
    @Test
    public void returnReverseWords(){
        String numb = "we outside";
       String expected ="ew edistuo";
        assertEquals(expected, FunctionsArray.returnValue(numb));
    }
    @Test
    public void returnReverseAnotherWords(){
        String numb = "we are corper";
        String expected ="ew era reproc";
        assertEquals(expected, FunctionsArray.returnValue(numb));
    }
    @Test
    public void checkWords() {
        String numb = "Anna";
        assertTrue( FunctionsArray.checkWord(numb));
    }
    @Test
    public void checkAnotherWords() {
        String numb = "Dad";
        assertTrue( FunctionsArray.checkWord(numb));
    }
    @Test
    public void checkAnotherWords2() {
        String numb = "Graces";
        assertFalse( FunctionsArray.checkWord(numb));
    }
    @Test
    public void testDominateNumber(){
        int [] array = {9,3,10,7,4};
        int [] expected = {10,7,4};
        assertArrayEquals(expected, FunctionsArray.dominateNumber(array));
    }
    @Test
    public void checkAnothernumber() {
        String numb = "1111";
        assertTrue( FunctionsArray.checkWordss(numb));
    }
    @Test
    public void checkAnotherWordInNumber() {
        String numb = "Graces";
        assertFalse( FunctionsArray.checkWordss(numb));
    }
    @Test
    public void testForNumberInBetween(){
        boolean result = FunctionsArray.checkForTarget("1-359",1,2,3);
        assertTrue(result);
    }
    @Test
    public void testForAnotherNumberInBetween(){
        boolean result = FunctionsArray.checkForTarget("1359",1,2,10);
        assertFalse(result);
    }
    @Test
    public void testForAnotherNumberInBetweens(){
        boolean result = FunctionsArray.checkForTarget("13596790",0,1,10);
        assertFalse(result);
    }


}

