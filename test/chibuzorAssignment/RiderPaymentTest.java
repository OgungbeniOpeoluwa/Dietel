package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiderPaymentTest {
    @Test
    public void testThatRiderPackageLessThan50() {
        int payment = RiderPayment.paymentCalculator(25);
        assertEquals(9000, payment);
    }

    @Test
    public void testThatRiderPackageIs50(){
        int payment = RiderPayment.paymentCalculator(50);
        assertEquals(15000,payment);
    }
    @Test
    public void testThatRiderPackageIsGreaterThan50AndLessThan59(){
        int payment = RiderPayment.paymentCalculator(58);
        assertEquals(16600,payment);
    }
    @Test
    public void testThatRiderPackageIsWithIn60(){
        int payment = RiderPayment.paymentCalculator(60);
        assertEquals(20000, payment);
        payment = RiderPayment.paymentCalculator(69);
        assertEquals(22250,payment);

    }
    @Test
    public void  testThatRiderPackageIsGreaterThan70(){
      int payment = RiderPayment.paymentCalculator(80) ;
      assertEquals(45000,payment);
    }
}