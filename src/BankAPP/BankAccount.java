package BankAPP;

import BankAPP.Exceptions.InvalidPinException;

public class BankAccount {
    private int balance;
    private String pin;
    private String accountNumber;
    private String accountName;

    public BankAccount(String name, String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        accountName = name;

        this.pin = pin;
    }
    public void deposit(int amount) {
        validate(amount);
        balance += amount;
    }

    public int checkBalance(String pin) {
        validate(pin);
        return balance;
    }

    private void validate(String pin) {
        if(!(pin.equals(this.pin)))throw new InvalidPinException("InValid Pin");
    }

    public int withdrawl(int amount,String pin) {
        validate(amount,pin);
        validate(amount);
        return balance -= amount;
    }
    private void validate(int amount,String pin) {
        if(amount > balance)throw new InsufficientBalanceException("InSufficient Funds");
        validate(pin);
    }
    private void validate(int amount) {
        if (amount < 0) throw new InvalidAmountException("Invalid Amounts");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public String getPin() {
        return pin;
    }
    public String toString(){
            return String.format("""
                ==================================
                Account Name : %s
                Account Number : %s
                Account Balance : %s
                Pin : UnAvailable
                =====================================""",getAccountName(),getAccountNumber(),checkBalance(getPin()));
        }
}
