package chibuzorAssignment;

import BankAPP.BankAccount;
import BankAPP.Exceptions.InvalidPinException;
import BankAPP.InsufficientBalanceException;
import BankAPP.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount account;
    @BeforeEach
    public void startAccount(){
        account = new BankAccount("Ope","076689","2023");
    }
    @Test
    public void testIfDeposit() {
        account.deposit(1000);
        assertEquals(1000,account.checkBalance("2023"));
    }
    @Test
    public void testIfIdeposit_1K_IWillWithdrawl500(){
        account.deposit(1000);
        assertEquals(500,account.withdrawl(500,"2023"));
    }
    @Test
    public void testInCorrectPinThrowsException(){
        assertThrows(InvalidPinException.class,() ->account.checkBalance("5465"));
    }
    @Test
    public void testIf_I_deposit_1K_Withdraw_5000(){
        account.deposit(1000);
        assertThrows(InsufficientBalanceException.class,() -> account.withdrawl(5000,"2023"));
    }
    @Test
    public void testIf_I_deposit_1K_Withdraw_lesser_than_0(){
        account.deposit(1000);
        assertThrows(InvalidAmountException.class,() -> account.withdrawl(-5000,"2023"));
    }


    @Test
    public void testThat_When_I_Put_IncorrectPin_I_Cant_Withdraw(){
        account.deposit(1000);
        assertThrows(InvalidPinException.class,() -> account.withdrawl(500,"678"));
    }
    @Test
    public void testThatICantDepositLesserThan0(){
        assertThrows(InvalidAmountException.class,() -> account.deposit(-5000));
    }




}