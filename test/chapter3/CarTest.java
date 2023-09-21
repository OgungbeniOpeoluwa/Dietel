package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testCarExit(){
        Car car = new Car("camry","1990",0.00);
        assertNotNull(car);

    }
    @Test
    public void testForName(){
        Car car = new Car("camry","126",5000.00);
        car.setModel("toyota");
        assertEquals("toyota",car.getModel());
    }
    @Test
    public void testForYear(){
        Car car = new Car("camry","126",5000.00);
        car.setYear("1990");
        assertEquals("1990",car.getYear());
    }
    @Test
    public void testForPrice(){
        Car car = new Car("camry","126",5000.00);
        car.setPrice(50000);
        assertEquals(50000,car.getPrice());
    }
    @Test
    public void testPriceIsNegative(){
        Car car = new Car("Toyota","567",50.00);
        car.setPrice(-20000);
        assertEquals(0,car.getPrice());

    }
    @Test
    public  void testThat5DiscountOnFirstCar(){
        Car car = new Car("Benz","2007",5000);
        car.setPrice(5000);
        car.discountPrice(5);
        assertEquals(4750,car.getPrice());

    }
    @Test
    public  void testThat5DiscountOnSecondCar(){
        Car car = new Car("Benz","2007",5000);
        car.setPrice(5000);
        car.discountPrice(7);
        assertEquals(4650,car.getPrice());

    }



}