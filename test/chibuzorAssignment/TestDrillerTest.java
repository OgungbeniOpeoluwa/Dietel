package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrillerTest {
    @Test
    public void testTwoCopiesAreCalculated(){
        int copy = TestDriller.input(2);
        assertEquals(4000,copy);
    }
    @Test
    public  void testCopiesWithin5To9(){
        int price = TestDriller.input(8);
        assertEquals(14400,price);
    }

    @Test
    public void testPriceOfCopiesWithin10To29(){
        int price = TestDriller.input(26);
        assertEquals(41600,price);

    }
    @Test
    public void testPriceOfCopyWithin30To49(){
        int price = TestDriller.input(36);
        assertEquals(54000,price);
    }

    @Test
    public void testPriceOfCopiesWithin50To99(){
        int price = TestDriller.input(88);
        assertEquals(114400,price);
    }

    @Test
    public void testPriceOfCopiesWithin100To1999(){
        int price = TestDriller.input(100);
        assertEquals(120000,price);
    }

    @Test
    public void testPriceOfCopiesWithin200To499(){
        int price = TestDriller.input(200);
        assertEquals(220000,price);

    }

    @Test
    public  void testPriceOfCopiesAbove500(){
        int price = TestDriller.input(500);
        assertEquals(500000,price);
    }









}