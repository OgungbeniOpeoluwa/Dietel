package practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
    @Test
    public void testSquareFunction(){
        int result = SquareRoot.squareRoot(25);
        assertEquals(5,result);
    }

}