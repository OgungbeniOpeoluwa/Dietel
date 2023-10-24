package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfErathonTest {
    @Test
    public void testSeivePrimeNumbers(){
        int [] numb = {2,3,5,7};
        assertArrayEquals(numb,SieveOfErathon.sieveFunction(1,10));
    }

    @Test
    public void testSeivePrimeNumbers20(){
        int [] numb = {2,3,5,7};
        assertArrayEquals(numb,SieveOfErathon.sieveFunction(1,10));
    }


}