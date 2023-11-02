package pizzaRecommendingApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaAppTest {
    @Test
    public void testAppAvailability(){
        PizzaApp pizzaApp = new PizzaApp();
        assertEquals(1200,pizzaApp.getPrice());
    }

}