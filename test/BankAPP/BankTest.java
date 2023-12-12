package BankAPP;

import BankAPP.Exceptions.InvalidAccountNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void testBankCanCreateAccount(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        assertEquals(1,gtbBank.getTotalNumberOfAccount());
        assertEquals("1",account.getAccountNumber());

    }
    @Test
    public void testBankCanCreate2Accounts(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        BankAccount account2 =  gtbBank.createAccount("Delighted","Debra","1999");
        assertEquals(2,gtbBank.getTotalNumberOfAccount());
        assertEquals("1",account.getAccountNumber());
        assertEquals("2",account2.getAccountNumber());
    }
    @Test
    public void testBankCanCreate2AccountsAndFindAccount(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        BankAccount account2 =  gtbBank.createAccount("Delighted","Debra","1999");
        assertEquals(2,gtbBank.getTotalNumberOfAccount());
        assertEquals(account,gtbBank.findAccount("1"));
        assertEquals(account2,gtbBank.findAccount("2"));
    }
    @Test
    public void testThatUserCanDeposit(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        gtbBank.deposit(1000,"1");
        assertEquals(1000,gtbBank.checkBalance("1","1999"));
    }

    @Test
    public void testThatUserCanWithdrawl(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        gtbBank.deposit(1000,"1");
        gtbBank.withdrawl(500,"1","1999");
        assertEquals(500,gtbBank.checkBalance("1","1999"));
    }

    @Test
    public void testBankCanAccount_one_Can_transfer_to_Account_two(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        BankAccount account2 =  gtbBank.createAccount("Delighted","Debra","1999");
        gtbBank.deposit(5000,"1");
        gtbBank.transfer("1","2",1000,"1999");
        assertEquals(4000,gtbBank.checkBalance("1","1999"));
        assertEquals(1000,gtbBank.checkBalance("2","1999"));
    }
    @Test
    public void testBankCanAccount_one_Cannot_transfer_to_AccountTHatDoesNotExit(){
        Bank gtbBank = new Bank();
        BankAccount account =  gtbBank.createAccount("Delighted","Debra","1999");
        gtbBank.deposit(5000,"1");
        assertThrows(InvalidAccountNumber.class,() -> gtbBank.transfer("1","2",1000,"1999"));
    }

}