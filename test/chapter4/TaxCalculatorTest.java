package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    @Test
    public void testThatTaxCalculatorExit(){
        TaxCalculator tax = new TaxCalculator();
        assertNotNull(tax);
    }
    @Test
    public void testThatTaxCalculatorStoreName(){
        TaxCalculator tax = new TaxCalculator();
        tax.setName("opeoluwa");
        assertEquals("opeoluwa",tax.getName());
    }

    @Test
    public void testThatTaxCalculatorCalculateTaxBelow30000Usd(){
        TaxCalculator tax = new TaxCalculator();
        tax.calculator(2000);
        assertEquals(300,tax.totalTax());

    }

    @Test
    public void testThatTaxCalculatorCanCalculateAbove30000Usd(){
        TaxCalculator tax = new TaxCalculator();
        tax.calculator(80000);
        assertEquals(16000,tax.totalTax());
    }

    @Test
    public void testThatTaxCalculatorReturnZeroForNoSalary(){
        TaxCalculator tax = new TaxCalculator();
        tax.calculator(-2000);
        assertEquals(0,tax.totalTax());
    }
}