package chapter14Excersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateFormatTest {
    @Test
    public void testThatDateFormartIsValid(){
        String date = "004/25/1955";
        assertThrows(RuntimeException.class,()->DateFormat.formartDate(date));
    }
    @Test
    public void getTheFormartdVersionOfDateInputtedTest(){
        String date = "04/25/1955";
        String expected ="April 25, 1955";
        assertEquals(expected,DateFormat.formartDate(date));
    }

}