package chibuzorAssignment;

public class BankAccount {
    private int balance;

    public BankAccount(String name, String accountNumber, String pin) {
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int checkBalance(String pin) {
        return balance;
    }

    public int withdrawl(int amount) {
        return balance -= amount;
    }
}
