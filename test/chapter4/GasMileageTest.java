package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage autoMobile;
    @BeforeEach
    public void setOn(){
        autoMobile = new GasMileage();
    }
    @Test
    public void testThatAutomobileExit(){
        assertNotNull(autoMobile);
    }
    @Test
    public void testThatDriverCanEnterMilesTaken(){
        autoMobile.miles(5000);
        assertEquals(5000,autoMobile.getMiles());
    }

    @Test
    public void testThatDriverCanInputNumberOfGallonUsed(){
        autoMobile.gallon(50);
        assertEquals(50,autoMobile.getGallon());
    }
    @Test
    public void testThatMilesPerGallonAreObtainedForEachTrip(){
        autoMobile.gallon(500);
        autoMobile.miles(50);
       double result = autoMobile.milesPerGallon();
        assertEquals(0.1,result);

    }
    @Test
    public void testCombinedMilesPerGallon(){
        autoMobile.gallon(500);
        autoMobile.miles(10);
        autoMobile.gallon(200);
        autoMobile.miles(120);
        autoMobile.gallon(100);
        autoMobile.miles(20);
        double result = autoMobile.combinedMilesPerGallon();
        assertEquals(0.1875,result);
    }



}



