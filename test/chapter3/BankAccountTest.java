package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    public void testName(){
        BankAccount account = new BankAccount("Jane Green",30);
        assertEquals("Jane Green",account.getName());
    }

}