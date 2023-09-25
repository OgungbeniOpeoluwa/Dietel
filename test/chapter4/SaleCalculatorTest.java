package chapter4;;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaleCalculatorTest {

    @Test
    public void testSalesCalculator(){
       SaleCalculator calculator = new SaleCalculator();
       calculator.set_unit_sold(5000);
       assertEquals(5000,calculator.get_unit_sold());
       double result =calculator.salesCalculator(9,1);
       assertEquals(650,result);

    }

    @Test
    public void testForMoreThanOneUnit(){
        SaleCalculator calculator = new SaleCalculator();
        calculator.set_unit_sold(5000);
        calculator.set_unit_sold(4000);
        double result = calculator.salesCalculator(9,2);
        assertEquals(1010,result);


    }

    }

