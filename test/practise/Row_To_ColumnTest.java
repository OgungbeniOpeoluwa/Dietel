package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Row_To_ColumnTest {
    @Test
    public void testExchangingRowToColumn(){
        double [][] array = {{55.5,45.6,70.9},{28.6,45.9,60.9},{34.5,68.78,23.4}};
        double [][] expected = {{34.5,28.6,55.5},{68.78,45.9,45.6},{23.4,60.9,70.9}};
        assertArrayEquals(expected,Row_To_Column.reverseRowToColumn(array));
    }
    @Test
    public void testAnotherExchangeOfRowToColumn(){
        double [][] array = {{55,45,70},{28,45,60},{34,68,23}};
        double [][] expected = {{34,28,55},{68,45,45},{23,60,70}};
        assertArrayEquals(expected,Row_To_Column.reverseRowToColumn(array));
    }
    @Test
    public void testForDifferentLengthOfRowToColumn(){
        double [][] array = {{55,45},{28,45},{34,68}};
        double [][] expected = {{34,28,55},{68,45,45}};
        assertArrayEquals(expected,Row_To_Column.reverseRowToColumn(array));
    }


}