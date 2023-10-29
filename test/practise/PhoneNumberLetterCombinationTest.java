package practise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberLetterCombinationTest {
    @Test
    public void testThatAllPossibleLetterOfCombinationIsReturn(){
        String numb = "23";
        String [] array = {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        assertArrayEquals(array,PhoneNumberLetterCombination.letterCombination(numb));


    }
    @Test
    public void testThatAllAnotherPossibleLetterOfCombinationIsReturn(){
        String numb = "2";
        String [] array = {"a","b","c"};
        System.out.println(Arrays.toString(PhoneNumberLetterCombination.letterCombination(numb)));
        assertArrayEquals(array,PhoneNumberLetterCombination.letterCombination(numb));


    }


}