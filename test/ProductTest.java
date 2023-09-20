import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {
    @Test
    public void testFunction(){
        int result = Product.multiplication(0,0);
        assertEquals(0,result);
    }
    @Test
    public void testIfBothNumbersAreNegative(){
        int result = Product.multiplication(5, -9);
        assertEquals(-45, result);
    }

    @Test
    public void testIfAnyNumberIsZero(){
        int result = Product.multiplication(5,-0);
        assertEquals(0, result);
    }
    @Test
    public void testIfSecondNumberIsNegative(){
        int result = Product.multiplication(5,-15);
        assertEquals(-75,result);
    }
}
