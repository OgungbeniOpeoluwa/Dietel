package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(500);
        assertEquals(500, account.checkBalance());
    }

    @Test
    public void testThatMoneyCanBeDepositedMultipleTimes() {
        Account account = new Account();
        account.deposit(500);
        assertEquals(500, account.checkBalance());
        account.deposit(1000);
        assertEquals(1500, account.checkBalance());
        account.deposit(2000);
        assertEquals(3500, account.checkBalance());
    }

    @Test
    public void testThatMoneyCanBeWithdrawn() {
        Account account = new Account();
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());
        account.withdrawal(2500);
        assertEquals(2500, account.checkBalance());
    }

    @Test
    public void testMultipleDeposit() {
        Account account = new Account();
        account.deposit(20000);
        assertEquals(20000, account.checkBalance());
        account.deposit(1000);
        assertEquals(21000, account.checkBalance());
        account.deposit(5000);
        assertEquals(26000, account.checkBalance());
        account.withdrawal(4000);
        assertEquals(22000, account.checkBalance());
    }

    @Test
    public void testWithdrawal() {
        Account account = new Account();
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());
        account.withdrawal(3000);
        assertEquals(2000, account.checkBalance());
    }


}
