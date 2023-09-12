package generalAssignment;

public class Account3 {
    private int balance;

    public Account3(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public int checkBalance(){
        return balance;
    }
}
