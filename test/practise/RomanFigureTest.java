package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanFigureTest {
    @Test
    public void testForRomanFigure() {
        int number = 30;
        String result = "xxx";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }
    @Test
    public void testForRomanFigureOf99() {
        int number = 99;
        String result = "xcix";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }
    @Test
    public void testForRomanFigureOf45() {
        int number = 45;
        String result = "xlv";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }

    @Test
    public void testForRomanFigureOf80() {
        int number = 80;
        String result = "lxxx";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }

    @Test
    public void testForRomanFigureOf165() {
        int number = 165;
        String result = "clxv";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }

    @Test
    public void testForRomanFigureOf104() {
        int number = 1994;
        String result = "mcmxciv";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }
    @Test
    public void testForRomanFigureOf2000() {
        int number = 3000;
        String result = "mmm";
        assertEquals(result, RomanFigure.numberToRomanFigure(number));
    }





}