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
        autoMobile.milesPerGallon(5000,50);
        autoMobile.gallon(5000);
        autoMobile.miles(50);
        assertEquals(100,autoMobile.getFuelConsumption());

    }
    @Test
    public void testThatCombinedMilesPerGallonForAllTripIsObtained(){
        autoMobile.milesPerGallon(5000,50);
        autoMobile.milesPerGallon(500,50);
        autoMobile.milesPerGallon(8000, 100);
        assertEquals(190,autoMobile.totalFuelConsumption());

    }
@Test
    public void testThatAverageOfAllCombineTripsIsCalculated(){
    autoMobile.milesPerGallon(5000,50);
    autoMobile.milesPerGallon(5000,50);
    autoMobile.milesPerGallon(5000, 50);
    autoMobile.setNumberOfCount(3);
    assertEquals(100,autoMobile.totalFuelConsumption()/autoMobile.getTotalNumberOfCount());


}



}