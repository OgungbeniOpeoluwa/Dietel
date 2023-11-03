package pizzaRecommendingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaAppTest {
    PizzaApp pizzaApp;
    @BeforeEach
        public void setUp(){
        pizzaApp = new PizzaApp();
    }

    @Test
    public void testAppSliceOfPizza(){
        assertEquals(10,pizzaApp.getSlice("Big"));
    }


    @Test
    public void testAppAvailability(){
        assertEquals(6,pizzaApp.getSlice("Medium"));
    }
    @Test
    public void testForPriceOfPizza(){
        assertEquals(1200,pizzaApp.getPrice("small"));
    }
    @Test
    public void orderForPizza(){
        String  typeOfPeople = "Hungry";
        int  numberOfPeople = 2;
        int expected = 4;
        assertEquals(expected,pizzaApp.getNumberOfPeopleSlice(numberOfPeople,typeOfPeople));
    }
    @Test
    public void numberOfSliceForTwoPeople(){
        String [][] typeOfPeople = {{"Hungry","2"},{"Super hungry","3"}};
        int expected = 16;
        assertEquals(expected,pizzaApp.getTotalNumberOfSlice(typeOfPeople));

    }

    @Test
    public void numberOfSliceForThreePeople(){
        String [][] typeOfPeople = {{"Hungry","2"},{"Super hungry","3"},{"Classic","10"}};
        int expected = 26;
        assertEquals(expected,pizzaApp.getTotalNumberOfSlice(typeOfPeople));

    }

    @Test
    public void numberOfSliceForOnePerson(){
        String [][] typeOfPeople = {{"Classic","10"}};
        int expected = 10;
        assertEquals(expected,pizzaApp.getTotalNumberOfSlice(typeOfPeople));

    }
    @Test
    public void testForNumberOfBoxNeeded() {
        String typeOfBox = "Big";
        String [][] typeOfPeople = {{"Hungry","10"},{"Super hungry","10"},{"Classic","5"}};
        int expected = 7;
        assertEquals(expected,pizzaApp.getTotalNumberOfBoxes(typeOfBox,typeOfPeople));

    }
    @Test
    public void testForNumberOfBoxNeededForAnotherSize() {
        String typeOfBox = "small";
        String [][] typeOfPeople = {{"Hungry","5"},{"Classic","6"}};
        int expected = 4;
        assertEquals(expected,pizzaApp.getTotalNumberOfBoxes(typeOfBox,typeOfPeople));

    }
    @Test
    public void testForRemainingSliceAfterGivenNumberOfBoxes() {
        String typeOfBox = "Big";
        String [][] typeOfPeople = {{"Hungry","10"},{"Super hungry","10"},{"Classic","5"}};
        int expected = 5;
        assertEquals(expected,pizzaApp.getNumberOfSlicesRemain(typeOfBox,typeOfPeople));

    }

    @Test
    public void testForPriceOfOrder() {
        String typeOfBox = "Big";
        String [][] typeOfPeople = {{"Hungry","10"},{"Super hungry","10"},{"Classic","5"}};
        int expected = 35000;
        assertEquals(expected,pizzaApp.getTotalPriceOfOrder(typeOfBox,typeOfPeople));


    }

    @Test
    public void testForException() {
        String typeOfBox = "Big Size";
        String [][] typeOfPeople = {{"Hungry","10"},{"Super hungry","10"},{"Class","5"}};
        assertThrows(IllegalArgumentException.class, ()-> pizzaApp.getTotalPriceOfOrder(typeOfBox, typeOfPeople));

    }
    }


