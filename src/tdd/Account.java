package tdd;

public class Account {
    private int balance;



    public void deposit(int amount) {
        balance = balance + amount;

    }

    public int checkBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        balance = balance - amount;

    }

    public void transfer(int amount, Account name) {
        withdrawal(amount);
        name.deposit(amount);
    }
}




