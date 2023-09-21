package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {
    @Test
    public void  testStationLocation(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("sabo","diseal",5,500,10);
        petrolPurchase.setLocation("Yaba");
        assertEquals("Yaba",petrolPurchase.getLocation());
    }
    @Test
    public void  testPetrolType(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("sabo","diseal",5,500,10);
        petrolPurchase.setPetrolType("Diseal");
        assertEquals("Diseal",petrolPurchase.getPetrolType());
    }
    @Test
    public void  testQuantityPurchase(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("sabo","diseal",5,500,10);
        petrolPurchase.setquantityPurchaseInLitters(5);
        assertEquals(5,petrolPurchase.getQuantityInLitters());
    }
    @Test
    public void  testPricePerLitter(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("sabo","diseal",5,500,10);
        petrolPurchase.setLocation("Yaba");
        assertEquals("Yaba",petrolPurchase.getLocation());
    }
    @Test
    public void testPurchaseAmount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("sabo","diseal",5,500,10);
        petrolPurchase.setquantityPurchaseInLitters(8);
        petrolPurchase.setPricePerLitter(500);
        petrolPurchase.setPercentageDiscount(10);
        assertEquals(3999.9,petrolPurchase.getPurchaseAmount());
    }

}